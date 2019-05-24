import Dependencies._

val buildShared = ProjectRef(file("project"), "buildShared")

// 2.12.8 is long since released as of writing this example, but 2.12.7 is aligned with SBT 1.2.8 (which is not typically required, but having it otherwise may result in performance problems - and we want to keep this example minimaal and out of any possible quirks)
scalaVersion := "2.12.7"

lazy val root = (project in file("."))
    .dependsOn(buildShared)
    .settings(name := s"build-shared-demo-${dummy}-${shared.Shared.sharedDummy}")

Compile / mainClass := Some("Main")
