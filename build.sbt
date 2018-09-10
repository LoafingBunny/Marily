import sbt.Keys._
import sbt._


lazy val commonSettings: Seq[Setting[_]]  = Seq(
  name := "Scurses Project",
  version := "1.0",
  scalaVersion := "2.11.12",
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
    mainClass in (Compile, run) := Some("net.team2xh.scurses.examples.GameOfLife")
  )

lazy val onions = (project in file("onions"))
  .settings(commonSettings: _*)
  .dependsOn(scurses)
  .settings(
    name := "Onions",
    mainClass in (Compile, run) := Some("net.team2xh.onions.examples.ExampleUI")
  )