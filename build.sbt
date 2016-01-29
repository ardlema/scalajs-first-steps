enablePlugins(ScalaJSPlugin)

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

persistLauncher in Compile := true

persistLauncher in Test := false

skip in packageJSDependencies := false

jsDependencies += RuntimeDOM

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.2"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.1"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

