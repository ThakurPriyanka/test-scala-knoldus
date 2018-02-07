package edu.knoldus.util


trait OperationOfUser {
  def authenticate(userList: List[User], userName: String, password: String): Int
  def register(userList: List[User], newUser: User): List[User]
}
