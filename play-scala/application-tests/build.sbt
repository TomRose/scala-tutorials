name := """application-tests"""
organization := "com.baeldung"

version := "1.0-SNAPSHOT"

enablePlugins(PlayScala)

scalaVersion := ScalaVersions.scala2Version

libraryDependencies += "com.google.inject" % "guice" % "6.0.0"
libraryDependencies += "com.h2database" % "h2" % "1.4.192"
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.14"
libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.1.0"
libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "5.1.0"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
libraryDependencies += "org.scalatestplus" %% "mockito-3-4" % "3.2.10.0" % Test
