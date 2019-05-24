val buildShared = project in file("buildShared")
val buildRoot = (project in file("."))
  .dependsOn(buildShared)
