object AreaCalculator {
  def main(args: Array[String]): Unit = {

//    area of circle
    var radius: Float = 0
    var area: Float = 0
    print("Enter the radius of circle: ")
    radius = scala.io.StdIn.readFloat()
    area = 3.14F * radius * radius
    println("The area of circle is :" +area)

//    area of rectangle
    var length: Float = 0
    var breadth: Float = 0
    var areaofrect = length * breadth
    print("Enter the length of rectangle:")
    length = scala.io.StdIn.readFloat()
    println("Enter the breadth of rectangle:")
    breadth = scala.io.StdIn.readFloat()
    println("Thea area of rectanle is:" +areaofrect)

  }

}
