package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadDto {
  val Employee1: Employee = Employee("John","Carter",25,45000.0,"Team Lead","knoldus","John@gmail.com")
  val Employee2: Employee = Employee("Maria","Sen",24,54000.0,"Scrum Master","philips","Maria@gmail.com")
  val employees: HashMap[String, Employee] = HashMap("John" -> Employee1, "Maria" -> Employee2)


  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
