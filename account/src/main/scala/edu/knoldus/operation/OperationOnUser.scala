package edu.knoldus.operation

import edu.knoldus.User

class OperationOnUser {

  def register(userList: List[User], newUser: User): List[User] = {
    def storeUser(userInnerList: List[User], newUser: User): List[User] = {
      userInnerList match {
        case user :: userOldList if user.userName != newUser.userName && user.mobileNumber != newUser.mobileNumber => storeUser(userOldList, newUser)
        case user :: _ if user.mobileNumber == newUser.mobileNumber => throw new Exception("Enter different mobile Number")
        case user :: _ if user.userName == newUser.userName => throw new Exception("Enter different UserName")
        case Nil => userList ::: List(newUser)
      }
    }
   storeUser(userList, newUser)
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
