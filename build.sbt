name := "log4j_test"

version := "0.1"

scalaVersion := "2.11.12"

ThisBuild / useCoursier := false

//libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.14.0" % Runtime

//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.7" % Provided

//libraryDependencies += "org.apache.logging.log4j" %% "log4j-api-scala" % "11.0"

//libraryDependencies += "ot.dispatcher" % "dispatcher-sdk_2.11" % "1.1.1"  % Compile

libraryDependencies += "ot.dispatcher" % "dispatcher_2.11" % "1.5.2"  % Compile
