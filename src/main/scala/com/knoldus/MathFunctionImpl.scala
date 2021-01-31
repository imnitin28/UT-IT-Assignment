package com.knoldus

object MathFunctionImpl {
  def checkPalindrome(num: Int): Boolean =
  {
    val Convert = num.toString
      if(Convert.equals(Convert.reverse))
        return true
      else
        return false
  }
  def calculateFactorial(n: Int): Int =
  {
    var f = 1
    for(i <- 1 to n)
    {
      f = f * i;
    }
    return f
  }
}