import Dependencies._
import sbt.Keys.libraryDependencies

// These settings apply to all submodules
ThisBuild / organization := "nl.codecraftr"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.10"
// These dependencies apply to all submodules
ThisBuild / libraryDependencies += scalaTest % Test
ThisBuild / libraryDependencies += mockito % Test

lazy val root = project
  .in(file("."))
  .settings(
    name := "multimodule-breakable-toy"
  )
  // This causes tasks on the root to be executed on submodules
  .aggregate(core, domain)

// If the name of the module matches the val, this suffices
lazy val domain = project
    .settings(name := "multimodule-domain")
    .dependsOn(core)
lazy val core = project
    .settings(name := "multimodule-core")
