package db

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite

class TestEmployeeReadDTo extends FunSuite(){

  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true if John exist"){
    assert(employeeReadDtoObject.getEmployeeByName("John") != None)
  }

  test("Should return true if Hazel exist"){
    assert(employeeReadDtoObject.getEmployeeByName("Maria") != None)
  }

  test("Should return false if John does not exist"){
    assert(employeeReadDtoObject.getEmployeeByName("Biden") === None)
  }
}