name := """sqlDependencies"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.16"

libraryDependencies += guice
libraryDependencies += "io.ebean" % "ebean" % "13.17.4"
libraryDependencies += "org.postgresql" % "postgresql" % "42.7.7"
libraryDependencies += "jakarta.persistence" % "jakarta.persistence-api" % "3.2.0"