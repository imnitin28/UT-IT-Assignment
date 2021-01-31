import org.scalatest.FunSuite
import com.knoldus.MathFunctionImpl
class MathFunctionTest extends FunSuite {

  test("Should return true if number is palindrome"){
    assert(MathFunctionImpl.checkPalindrome(1551) === true)
  }

  test("Factorial of 0 should be 1"){
    assert(MathFunctionImpl.calculateFactorial(0) === 1)
  }
}
