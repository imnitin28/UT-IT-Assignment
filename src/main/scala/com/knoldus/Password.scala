package com.knoldus
object Password{
  def isValid(passwd: String) : Boolean = {
    if(passwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$"))
      return true
    else
      return false
  }
}