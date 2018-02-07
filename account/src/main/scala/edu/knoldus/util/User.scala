package edu.knoldus.util

case class User(userName: String, password: String, mobileNumber: String) {
  override def toString(): String = {
    s"userName: $userName Password: $password mobileNumber $mobileNumber"
  }
}
