package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee
class EmployeeValidator {

  val emailValidatorObject = new EmailValidator()
  val companyReadDtoObject = new CompanyReadDto()

  def employeeIsValid(employee: Employee): Boolean = {

    if(companyReadDtoObject.getCompanyByName(employee.companyName) != null && emailValidatorObject.emailIdIsValid(employee.emailId) == null)
      return true
    else
      return false
  }
}
