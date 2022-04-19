import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "RedditCrawler",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "2.2.1"
