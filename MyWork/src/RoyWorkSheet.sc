object RoyWorkSheet {
 
 case class Person(name:String,age:Int)
 
 val ppl = Array(Person("Anvar",36),Person("Rio",6))
                                                  //> ppl  : Array[RoyWorkSheet.Person] = Array(Person(Anvar,36), Person(Rio,6))
 
 val Person(n,a) = ppl(0)                         //> n  : String = Anvar
                                                  //| a  : Int = 36
 
 new java.io.File(".").getAbsolutePath()          //> res0: String = C:\Users\aroy22\Downloads\scala-SDK-4.7.0-vfinal-2.12-win32.w
                                                  //| in32.x86_64\eclipse\.
 println("Hello Anvar")                           //> Hello Anvar
  
}