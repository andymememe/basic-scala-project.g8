name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.13.2" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
