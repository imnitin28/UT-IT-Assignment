import org.scalatest.FunSuite
import com.knoldus.Password
class ValidPassword extends FunSuite {
  test("Should return true if password is valid"){
    assert(Password.isValid("Abc@12365") === true)
  }
}