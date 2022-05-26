import com.rafa.utils.SparkUtils
import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]): Unit = {
    val ss:SparkSession = SparkSession.builder().appName("SparkUtilsTest").master("local[1]").getOrCreate()
    SparkUtils.dfFromCSV(ss,"src/main/resources/All_Places_Of_Worship.csv",',',header = true).show()
  }
}
