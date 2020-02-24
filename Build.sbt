name := "EquiTruss"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion

libraryDependencies += "org.apache.spark" %% "spark-graphx" % sparkVersion

resolvers += "SparkPackages" at "https://dl.bintray.com/spark-packages/maven"

libraryDependencies += "graphframes" % "graphframes" % "0.7.0-spark2.3-s_2.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
