ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "mini-bank"
  )
name := "mini-bank"

lazy val akkaHttpVersion = "10.2.8"
lazy val akkaVersion = "2.6.9"
lazy val circeVersion = "0.14.1"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.2.9",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.19",
  "com.typesafe.akka" %% "akka-stream" % "2.6.19",
  "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.19",
  "com.datastax.oss" % "java-driver-core" % "4.14.1",
  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.0.5",
  "io.circe" %% "circe-core" % "0.14.1",
  "io.circe" %% "circe-generic" % "0.14.1",
  "io.circe" %% "circe-parser" % "0.14.1",
  "de.heikoseeberger" %% "akka-http-circe" % "1.39.2",
  "ch.qos.logback" % "logback-classic" % "1.2.11",

  "com.typesafe.akka" %% "akka-http-testkit" % "10.2.9" % Test,
  "org.scalatest" %% "scalatest" % "3.2.12",
)