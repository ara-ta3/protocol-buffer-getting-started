
lazy val root = (project in file("."))
  .settings(
    name := "protocol-buffer-getting-started",
    version := "0.1-SNAPSHOT",
  )

lazy val scala_protobuff = (project in file("scala_protobuff"))
  .settings(
    name := "protocol-buffer-getting-started-in-scala",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.12.5",
    )

