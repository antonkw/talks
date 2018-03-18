import sbt._

object Dependencies {

  object Versions {
    val catsEffect    = "0.9"
    val fs2           = "0.10.2"
    val http4s        = "0.18.0"
    val circe         = "0.9.1"

    val scalaTest     = "3.0.4"
    val scalaCheck    = "1.13.5"

    val kindProjector = "0.9.5"
    val logback       = "1.2.1"
  }

  object Libraries {
    def circe(artifact: String): ModuleID   = "io.circe"    %% artifact % Versions.circe
    def http4s(artifact: String): ModuleID  = "org.http4s"  %% artifact % Versions.http4s

    lazy val catsEffect     = "org.typelevel"         %% "cats-effect"      % Versions.catsEffect
    lazy val fs2Core        = "co.fs2"                %% "fs2-core"         % Versions.fs2

    lazy val http4sServer   = http4s("http4s-blaze-server")
    lazy val http4sClient   = http4s("http4s-blaze-client")
    lazy val http4sDsl      = http4s("http4s-dsl")
    lazy val http4sCirce    = http4s("http4s-circe")

    lazy val circeCore      = circe("circe-core")
    lazy val circeGeneric   = circe("circe-generic")
    lazy val circeGenericX  = circe("circe-generic-extras")

    lazy val scalaCheck     = "org.scalacheck"        %% "scalacheck"       % Versions.scalaCheck
    lazy val scalaTest      = "org.scalatest"         %% "scalatest"        % Versions.scalaTest

    lazy val kindProjector  = "org.spire-math"        %% "kind-projector"   % Versions.kindProjector
    lazy val logback        = "ch.qos.logback"        %  "logback-classic"  % Versions.logback
  }

}
