/**
  * @描述:
  * @公司:
  * @作者: 王聪
  * @版本: 1.0.0
  * @日期: 2019/9/7 23:35
  */
object ToDemo {
  def main(args: Array[String]): Unit = {
    // Range:to:默认步进为1
    val to1 = 1 to 10
    println(to1)
    // 定义一个不进为2的Range
    val to2 = 1 to 10 by 2
    println(to2)
    println(to2.toList)

    // Range:until
    val until1 = 1 until 10
    println(until1)
    val until2 = 1 until 10 by 2
    println(until2)
  }

}
