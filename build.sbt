name := "allure-specs2-example"

organization := "ru.yandex.qatools.allure"

version := "0.0.1"

scalaVersion := "2.10.3"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "ru.yandex.qatools.allure" %% "allure-specs2" % "1.4.0-SNAPSHOT" % "test"
)

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.Specs2, "notifier", "ru.yandex.qatools.allure.specs2.AllureNotifier")
)
