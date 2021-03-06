package com.knoldus.validator
import com.knoldus.validator.EmailValidator
class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = {
    if(emailId.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
      return true
    else
      return false
  }
}
