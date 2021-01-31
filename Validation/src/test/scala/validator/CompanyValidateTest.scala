import com.knoldus.db.{CompanyReadDto, UserReadDto}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}
import org.scalatest.FunSuite

class CompanyValidateTest extends FunSuite {
  val companyValidatorObject = new CompanyValidator()
  val emailObject = new EmailValidator()
  val companyObject = new CompanyReadDto()
  test("Should return true if company does not exist in database and email is valid") {
    assert(companyValidatorObject.companyIsValid(companyObject.knoldusCompany)===true && emailObject.emailIdIsValid(emailId = "knoldus@gmail.com")=== true)
  }
}
