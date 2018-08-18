val ScalatraVersion = "2.6.3"

libraryDependencies ++= Seq(
    "org.scalatra" %% "scalatra" % ScalatraVersion,
    "org.scalatra" %% "scalatra-json" % ScalatraVersion,
    "org.json4s"   %% "json4s-jackson" % "3.5.2",
    "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)


PB.targets in Compile := Seq(
    scalapb.gen() -> (sourceManaged in Compile).value
)

enablePlugins(JettyPlugin)
