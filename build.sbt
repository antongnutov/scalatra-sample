import org.scalatra.sbt._

ScalatraPlugin.scalatraSettings

organization := "sample"

name := "Hello Scalatra"

version := "0.1"

scalaVersion := "2.12.1"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % Versions.scalatra,
  "org.scalatra" %% "scalatra-scalate" % Versions.scalatra,

  "org.slf4j" % "slf4j-api" % Versions.slf4j,
  "org.apache.logging.log4j" % "log4j-api" % Versions.log4j,
  "org.apache.logging.log4j" % "log4j-core" % Versions.log4j,
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % Versions.log4j,

  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",

  "org.scalatra" %% "scalatra-scalatest" % Versions.scalatra % "test"
)

enablePlugins(JettyPlugin)
