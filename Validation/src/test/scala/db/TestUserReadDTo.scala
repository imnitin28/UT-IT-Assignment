package db

import com.knoldus.db.UserReadDto
import org.scalatest.FunSuite

class TestUserReadDTo extends FunSuite(){

  val userReadDtoObject = new UserReadDto()

  test("Should return true if William exist"){
    assert(userReadDtoObject.getUserByName("William") != None)
  }

  test("Should return true if Hazel exist"){
    assert(userReadDtoObject.getUserByName("Hazel") != None)
  }

  test("Should return false if John does not exist"){
    assert(userReadDtoObject.getUserByName("John") === None)
  }
}