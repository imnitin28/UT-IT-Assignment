name := "UT-IT-Assignment"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test","org.mockito" %% "mockito-scala" % "1.5.12" % Test)

lazy val Validation = project.in(file("Validation"))
  .settings(
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test","org.mockito" %% "mockito-scala" % "1.5.12" % Test)
    )