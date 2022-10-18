name := "hello"

version := "1.0"

//trying upgrade to to 2.13.7
scalaVersion := "2.13.10"

val fastParseVersion = "2.3.3"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "fastparse" % fastParseVersion
)
