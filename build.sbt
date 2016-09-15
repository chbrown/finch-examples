organization := "dev.finch"

name := "examples"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++=
  Seq("finch-core", "finch-circe").map("com.github.finagle" %% _ % "0.11.0-M3") ++
  Seq("circe-core", "circe-generic", "circe-parser").map("io.circe" %% _ % "0.5.1")

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-language:implicitConversions")
