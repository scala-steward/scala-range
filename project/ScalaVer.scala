import sbt.Keys.{crossScalaVersions, scalaVersion}
import sbt.settingKey

sealed abstract class ScalaVer(val full: String)

object ScalaVer {

  final case object _211 extends ScalaVer("2.11.12")

  final case object _212 extends ScalaVer("2.12.20")

  final case object _213 extends ScalaVer("2.13.16")

  final case object _300 extends ScalaVer("3.7.1")

  val values: Seq[ScalaVer] = Set(_211, _212, _213, _300).toSeq

  val default: ScalaVer = _212

  def fromEnv: Option[ScalaVer] = sys.env.get("SCALA_VER") flatMap fromString

  def fromString(full: String): Option[ScalaVer] = full match {
    case x if x startsWith "2.11" => Some(_211)
    case x if x startsWith "2.12" => Some(_212)
    case x if x startsWith "2.13" => Some(_213)
    case x if x startsWith "3.0"  => Some(_300)
    case _                        => None
  }

  lazy val scalaV = settingKey[ScalaVer]("Current Scala Version")


  def settings = Seq(
    scalaVersion        := (ScalaVer.fromEnv getOrElse ScalaVer.default).full,
    crossScalaVersions  := ScalaVer.values.map(_.full),
    scalaV              := ScalaVer.fromString(scalaVersion.value) getOrElse ScalaVer.default)
}
