package week01

object isgoodEnough {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(131); 

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(53); 

  def isGoodEnough(guess: Double, x: Double) = ???;System.out.println("""isGoodEnough: (guess: Double, x: Double)Nothing""");$skip(68); 

  def improve(guess: Double, x: Double) = (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(43); 

  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""")}
}
