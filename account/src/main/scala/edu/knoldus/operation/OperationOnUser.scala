package edu.knoldus.operation

import edu.knoldus.User

class OperationOnUser {

  def register(userList: List[User], newUser: User): List[User] = {
    userList match {
      case user :: userOldList if user.mobileNumber == newUser.mobileNumber  => throw new Exception("Enter different mobile Number")
      case user :: userOldList if user.userName == newUser.userName  => throw new Exception("Enter different UserName")
      case user :: userOldList if user.userName != newUser.userName && user.mobileNumber != newUser.mobileNumber => register(userOldList, user)
      case Nil => newUser :: userList
    }
  }

  def authenticate(userList: List[User], userName: String, password: String): Int = {
    userList match {
      case user :: userOldList if user.userName == userName && user.password == password => user.mobileNumber.##
      case user :: userOldList if user.userName != userName => authenticate(userOldList, userName, password)
      case user :: userOldList if user.password != password => authenticate(userOldList, userName, password)
      case Nil => throw new Exception("Username password does not match")
    }
  }
}
