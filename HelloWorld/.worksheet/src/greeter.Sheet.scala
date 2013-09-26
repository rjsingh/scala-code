package greeter

object Sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val x = 2;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(22); 
  val b = increase(x);System.out.println("""b  : Int = """ + $show(b ));$skip(28); 
	println("result is :" + b)}
}
