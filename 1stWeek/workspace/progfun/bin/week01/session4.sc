package week01

object session4 {
	1 + 3

  def abs(x: Double) =  if( x < 0) - x else x
  
  	def sqrt(x:Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double) =
      abs(square(guess) - x) < 0.001

    sqrtIter(1.0)
  }
  
  sqrt(2)
	sqrt(4)
  sqrt(1e-6)
  sqrt(1e60)
  
  
}