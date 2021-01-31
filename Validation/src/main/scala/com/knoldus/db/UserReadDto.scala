package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadDto {
  val User1: User = User("William","Jones",25,45000.0,"Sports","Delhi","John@gmail.com")
  val User2: User = User("Hazel","Crowney",24,54000.0,"Yoga","Chennai","Maria@gmail.com")
  val users: HashMap[String, User] = HashMap("William" -> User1, "Hazel" -> User2)


  def getUserByName(name: String): Option[User] = users.get(name)
  //def getUserByName(name: String): Option[User] = User.

}
