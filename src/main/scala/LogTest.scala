import org.apache.spark.sql.DataFrame
import ot.dispatcher.sdk.{PluginCommand, PluginUtils}
import ot.dispatcher.sdk.core.SimpleQuery
//libraryDependencies += "ot.dispatcher" % "dispatcher-sdk_2.11" % "sdk_version" % Compile



class LogTest(sq: SimpleQuery, utils: PluginUtils) extends PluginCommand(sq, utils) with SparkSessionWrapper {
  override def transform(_df: DataFrame): DataFrame = {
    log.debug("________________________________________")
    log.info("________________________________________")
    log.error("________________________________________")
    log.fatal("________________________________________")

    import spark.implicits._

    Seq(1, 2, 3).toDF("numbers")
  }
}
