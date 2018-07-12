object RoyWorkSheet {
 
 case class Person(name:String,age:Int);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 
 
 val ppl = Array(Person("Anvar",36),Person("Rio",6));System.out.println("""ppl  : Array[RoyWorkSheet.Person] = """ + $show(ppl ));$skip(28); 
 
 val Person(n,a) = ppl(0);System.out.println("""n  : String = """ + $show(n ));System.out.println("""a  : Int = """ + $show(a ));$skip(43); val res$0 = 
 
 new java.io.File(".").getAbsolutePath();System.out.println("""res0: String = """ + $show(res$0));$skip(24); 
 println("Hello Anvar")}
  
}
