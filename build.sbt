import Dependencies._
import sbt.Keys.libraryDependencies

lazy val root = project
  .enablePlugins(ScalafmtPlugin)
  .in(file("."))
  .settings(
    name := "Sbt Multimodule Breakable Toy",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := projectScalaVersion,
    Defaults.itSettings,
    libraryDependencies += scalaTest % Test,
    libraryDependencies += mockito % Test
  )
val projectScalaVersion = "2.13.10"
