ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

lazy val root = (project in file("."))
  .settings(
    name := "tests_with_same_name_in_two_modules"
  )

lazy val module1 = (project in file("./module1"))
  .dependsOn(root)
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test"
  )

lazy val module2 = (project in file("./module2"))
  .dependsOn(root)
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test"
  )
