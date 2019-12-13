inThisBuild(List(
  scalaVersion := "2.12.10",
  organization := "com.geirsson",
  credentials += Credentials(
  "GnuPG Key ID",
  "gpg",
  "7957CF210A706035C10F214962744880285183AC", // key identifier
  "ignored" // this field is ignored; passwords are supplied by pinentry
),
useSuperShell := false
))
skip in publish := true
lazy val framework = project
  .settings(
    moduleName := "scalatest-framework",
    libraryDependencies ++= List(
      "org.scala-sbt" % "test-interface" % "1.0",
      "org.scalatest" %% "scalatest" % "3.0.8"
      )
    )
