import java.util._
import scala.collection.JavaConversions._
import scala.io.Source

object WrapString {
 
 //val inp = Source.fromFile("C:\\Users\\aroy22\\workspace\\Input\\Words.txt").getLines.toList
 //val inpRDD = inp.
  
 val inp = Array("I","am","very","good","boy")
     
 def simulateExpensiveObjectCreation() {
   Thread sleep 10
}
  
 def wrapSingleWord(original: String) : String = {
  simulateExpensiveObjectCreation()
  val sb = new StringBuilder()
  return sb.append(">>").append(original).append("<<").toString()
} 
  
 def wrapMultiWords(words: Iterator[String]) : Iterator[String] = {
   simulateExpensiveObjectCreation()
   val sb = new StringBuilder()
   val wList = new ArrayList[String]()
   while( words.hasNext ) {
      sb.setLength(0)
      wList.add( sb.append(">>").append(words.next()).append("<<").toString() )
   }
   return wList.iterator()
 }

 val wSW = inp.map(wd => wrapSingleWord(wd))
 println(wSW)
 


}