
import com.knoldus.models.{Company, User}
import com.knoldus.request.{CompanyImpl, UserImpl}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}
import org.mockito.MockitoSugar.{mock, when}

class UnitTestUser extends org.scalatest.AsyncFlatSpec {
  val users= User("William","Jones",25,45000.0,"Sports","Delhi","John@gmail.com")

  "A user " should " exist in database" in {
    val mockedUValidator = mock[UserValidator]
    when(mockedUValidator.userIsValid(users)) thenReturn false

    val userimpl = new UserImpl(mockedUValidator)

    val res = userimpl.createUser(users)
    assert(res.isEmpty)
  }
  it should "have a valid email id" in{
    val emailvalid=new EmailValidator
    assert(emailvalid.emailIdIsValid(users.emailId))
  }
}

