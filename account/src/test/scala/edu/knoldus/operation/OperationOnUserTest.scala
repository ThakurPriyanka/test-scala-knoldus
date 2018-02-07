package edu.knoldus.operation

import edu.knoldus.util.User
import org.scalatest.FlatSpec

class OperationOnUserTest extends FlatSpec {

  val userName1 = "priyanka"
  val userName2 = "himanshu"
  val userName3 = "neha"
  val userName4 = "radhika"

  val password1 = "qaz123"
  val password2 = "qwe123"
  val password3 = "plm123"

  val mobileNumber1 = "1111111111"
  val mobileNumber2 = "1111111112"
  val mobileNumber3 = "1111111114"
  val mobileNumber4 = "1110111145"

  val user1 = User(userName1, password1, mobileNumber1)
  val user2 = User(userName2, password2, mobileNumber2)
  val user3 = User(userName3, password3, mobileNumber3)
  val user4 = User(userName4, password1, mobileNumber4)
  val userList = List(user1, user2, user3)

  val operationObject = new OperationOnUser


  "register user " should "add user and give a new List" in {
    assertThrows[Exception](operationObject.register(userList, user3))
    assertThrows[Exception](operationObject.register(userList, User(userName1, password3, mobileNumber4)))
    assert(operationObject.register(userList, user4) == userList ::: List(user4) )
  }


  "authenticate method" should "return a unique token" in {
    assertThrows[Exception](operationObject.authenticate(userList, userName1, password2))
    assert(operationObject.authenticate(userList, userName1, password1) == mobileNumber1.## )
  }

}
