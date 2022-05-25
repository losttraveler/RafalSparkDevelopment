import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
import org.scalatest.funsuite.AnyFunSuite

class SparkUtilsTest extends AnyFunSuite{
  val ss:SparkSession = SparkSession.builder().appName("SparkUtilsTest").master("local[1]").getOrCreate()
  Logger.getLogger("org").setLevel(Level.ERROR)
  test("dfFromCSV"){
    SparkUtils.dfFromCSV(ss,"src/main/resources/All_Places_Of_Worship.csv",',',header = true).show()
  }
}
