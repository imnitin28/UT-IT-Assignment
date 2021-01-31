import com.knoldus.db.UserReadDto
import com.knoldus.validator.EmailValidator
import org.scalatest.FunSuite

class EmailIDValidateTest extends FunSuite{

  val emailObject = new EmailValidator()
  val userReadDtoObject = new UserReadDto()

  test("Should return true if Email ID is valid"){
    assert(emailObject.emailIdIsValid(userReadDtoObject.User1.emailId) === true)
  }
}
