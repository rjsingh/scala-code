package greeter

object Sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = 2                                       //> x  : Int = 2
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  val b = increase(x)                             //> b  : Int = 3
	println("result is :" + b)                //> result is :3
}