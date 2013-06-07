import sbt._
import Keys._

object ScalaBuffBuild extends Build {
  lazy val project = Project(
    id = "root", 
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
      publishTo := Some("releases" at "http://dev.minutekey.com:9090/nexus/content/repositories/releases")
    )
  )
}
