name := "test-scala-knoldus"

lazy val commonSettings = Seq {
  version := "0.1"

  scalaVersion := "2.12.4"

  libraryDependencies ++= Seq("log4j" % "log4j" % "1.2.17",
    "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test")
}

lazy val root = (project in file(".")).aggregate(dashboard, apiResources, inventory, account,checkout).
  dependsOn(dashboard, apiResources, inventory, account,checkout)

lazy val dashboard = (project in file("dash-board"))
  .settings(
    commonSettings
  ).aggregate(apiResources).dependsOn(apiResources)

lazy val apiResources = (project in file("api-resources"))
  .settings(
    commonSettings
  ).aggregate(inventory, account, checkout).dependsOn(inventory, account, checkout)

lazy val inventory = (project in file("inventory"))
  .settings(
    commonSettings
  )

lazy val account = (project in file("account"))
  .settings(
    commonSettings
  )
lazy val checkout = (project in file("knolkart-cart-service"))
  .settings(
    commonSettings
  ).aggregate(inventory).dependsOn(inventory)
