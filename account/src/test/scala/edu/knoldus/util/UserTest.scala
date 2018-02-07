package edu.knoldus.util

import org.scalatest.FlatSpec

class UserTest extends FlatSpec{

  val userName1 = "priyanka"
  val password1 = "qaz123"
  val mobileNumber1 = "1111111111"

  val user1 = User(userName1, password1, mobileNumber1)

  "toString method" should "return the string containing user detail" in {
    assert(user1.toString == "userName: priyanka Password: qaz123 mobileNumber 1111111111" )
  }
}
