import org.apache.logging.log4j.scala.{Logger, Logging}
import org.apache.logging.log4j.Level

class User(val name: String)

class MyClass extends Logging {


  def doStuff(): Unit =
    logger.info("Doing stuff")

  def doStuffWithLevel(level: Level): Unit =
    logger(level, "Doing stuff with arbitrary level")

  def doStuffWithUser(user: User): Unit =
    logger.info(s"Doing stuff with ${user.name}")

}

object MyObj extends App {

  val mc = new MyClass
  mc.doStuff()

  mc.doStuffWithLevel(Level.ALL)
  mc.doStuffWithLevel(Level.DEBUG)
  mc.doStuffWithLevel(Level.ERROR)
  mc.doStuffWithLevel(Level.FATAL)
  mc.doStuffWithLevel(Level.INFO)
  mc.doStuffWithLevel(Level.TRACE)
  mc.doStuffWithLevel(Level.WARN)

  mc.doStuffWithUser(new User("mike"))

}
