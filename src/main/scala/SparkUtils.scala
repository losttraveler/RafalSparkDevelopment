import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkUtils {
  def dfFromCSV(ss:SparkSession,path:String): DataFrame ={
    ss.read
      .csv(path)
  }
  def dfFromCSV(ss:SparkSession,path:String,delimiter:Char): DataFrame ={
    ss.read
      .option("delimiter",delimiter)
      .csv(path)
  }
  def dfFromCSV(ss:SparkSession,path:String,header:Boolean): DataFrame ={
    ss.read
      .option("header",header)
      .csv(path)
  }
  def dfFromCSV(ss:SparkSession,path:String,delimiter:Char,header:Boolean): DataFrame ={
    ss.read
      .option("header",header)
      .option("delimiter",s"$delimiter")
      .csv(path)
  }
}
