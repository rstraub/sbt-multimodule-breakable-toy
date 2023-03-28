import Dependencies._

// These settings apply to all submodules
ThisBuild / organization := "nl.codecraftr"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.10"

// These dependencies apply to all submodules
lazy val commonDependencies = Seq(
  scalaTest % Test,
  mockito % Test
)

// These settings apply to all submodules
lazy val commonSettings = Seq(
  // Exclude tagged tests from the build
  Test / testOptions := Seq(Tests.Argument("-l", "nl.codecraftr.sbt.multimodule.core.WIP")),
  libraryDependencies ++= commonDependencies
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "multimodule-breakable-toy",
  )
  // This causes tasks on the root to be executed on submodules
  .aggregate(core, domain)

// If the name of the module matches the val, this suffices
lazy val domain = project
  .settings(
    name := "multimodule-domain",
    commonSettings
  )
  // This adds a dependency on the core module, as well as its test sources
  .dependsOn(core % "compile->compile;test->test")

lazy val core = project
  .settings(
    name := "multimodule-core",
    commonSettings
  )
