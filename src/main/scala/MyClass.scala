//import org.apache.logging.log4j.scala.Logging
//import org.apache.logging.log4j.Level

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

class User(val name: String)

class MyClass /*extends Logging*/ {

//  def doStuff(): Unit =
//    logger.info("Doing stuff")
//
//  def doStuffWithLevel(level: Level): Unit =
//    logger(level, "Doing stuff with arbitrary level")
//
//  def doStuffWithUser(user: User): Unit =
//    logger.info(s"Doing stuff with ${user.name}")

  val spark: SparkSession = SparkSession
    .builder
    .appName("embedded log4j test")
//    .master("local[*]")
    .getOrCreate()
  println("spark started")

  val log: Logger = Logger.getLogger("logger")
  log.info("")
  log.info("111")
  log.info("")

  spark.stop
  println("spark shutdowned")


}

// ./spark-submit --class MyObj /home/mike/_repos/log4j_test/target/scala-2.11/log4j_test_2.11-0.1.jar

object MyObj extends App {

  val mc = new MyClass
//  mc.doStuff()
//  println()
//
//  // *
//  mc.doStuffWithLevel(Level.ALL)
//  // *
//  mc.doStuffWithLevel(Level.DEBUG)
//  mc.doStuffWithLevel(Level.ERROR)
//  mc.doStuffWithLevel(Level.FATAL)
//  mc.doStuffWithLevel(Level.INFO)
//  // *
//  mc.doStuffWithLevel(Level.TRACE)
//  mc.doStuffWithLevel(Level.WARN)
//  println()
//
//  mc.doStuffWithUser(new User("mike"))

}
