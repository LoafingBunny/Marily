import sbt.Keys._
import sbt._


lazy val commonSettings: Seq[Setting[_]]  = Seq(
  name := "Marilyn",
  version := "1.1",
  scalaVersion := "2.12.6",
  scalacOptions ++= Seq("-feature", "-unchecked")
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(scurses, onions)

lazy val scurses = (project in file("scurses"))
  .settings(commonSettings: _*)
  .settings(
    name := "Scurses",
    libraryDependencies += "com.lihaoyi" %% "fastparse" % "1.0.0",
    mainClass in (Compile, run) := Some("org.marily.scurses.examples.GameOfLife")
  )

lazy val onions = (project in file("onions"))
  .settings(commonSettings: _*)
  .dependsOn(scurses)
  .settings(
    name := "Onions",
    mainClass in (Compile, run) := Some("org.marily.onions.examples.ExampleUI")
  )

lazy val maril = (project in file("maril"))
  .settings(commonSettings: _*)
  .dependsOn(onions)
  .settings(
    name := "Maril"
//    mainClass in (Compile, run) := Some("net.team2xh.onions.examples.ExampleUI")
  )