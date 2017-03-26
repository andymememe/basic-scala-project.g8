name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" % "scalacheck_2.12" % "1.13.5" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
