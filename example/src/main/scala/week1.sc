def abs(x:Double) = if (x < 0) -x else x



def sqrt(x: Double) = {
  sqrtIter(1.0, x)
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) = abs(guess*guess-x) < x*1e-6

  def improve(guess: Double, x: Double) =(guess + x / guess) / 2

}

def factorial(x:Int):Int={
  def facrec(x:Int,product:Int):Int=
    if (x==0) product else facrec(x-1,product*x)
  facrec(x,1)
}
factorial(30)