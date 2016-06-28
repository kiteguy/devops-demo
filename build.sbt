name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
enablePlugins(DebianPlugin)
maintainer := "Jon Olby <jon.olby@gmail.com>"
packageSummary := "My play package"
packageDescription := "Package"
