object LargestNumber {
  def test(x:Int , y:Int, z:Int) : Int = {
    List(x,y,z).max
  }
  def main(args: Array[String]): Unit = {
    println("Result is:" +test(5,40,1))
  }

}
