package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  val emailValidatorObject = new EmailValidator()
  val companyReadDtoObject = new CompanyReadDto()

  def companyIsValid(company: Company): Boolean =
  {
    if(emailValidatorObject.emailIdIsValid(company.emailId) && companyReadDtoObject.getCompanyByName(company.name) != null)
      return true
    else
      return false
  }
}
