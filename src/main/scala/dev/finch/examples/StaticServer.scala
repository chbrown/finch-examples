package dev.finch.examples

import com.twitter.finagle.Http

// Straight from https://github.com/finagle/finch/blob/0.11.0-M3/docs/cookbook.md#serving-static-content

import io.finch._
import com.twitter.io.{Reader, Buf}
import java.io.File

object StaticServer {
  val reader: Reader = Reader.fromFile(new File("/dev/urandom"))

  val file: Endpoint[Buf] = get("file") {
    Ok(Reader.readAll(reader))
  }

  def main(args: Array[String]): Unit = {
    Http.server.serve(":8081", file.toServiceAs[Text.Plain])
  }
}
