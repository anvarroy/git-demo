
import scala.io.Source

object Strings {
  def main(args: Array[String]) : Unit = {
    
    var a = "Anvar"
    var b = "Roy"
   
    var c = a.concat(b)
    var d = c.length()
    
    println("String Concat : " + c)
    println("Length is: " + d)
    
  }
}