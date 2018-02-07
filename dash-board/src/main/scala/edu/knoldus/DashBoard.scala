package edu.knoldus

import edu.knoldus.util.{Inventory, Product, User}
//import org.apache.log4j.Logger

class DashBoard extends Creator {

  def start(): Boolean = {
//    val log = Logger.getLogger(this.getClass)
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

      val productId1 = 123
      val productId2 = 124
      val productId3 = 125
      val productId4 = 126
      val productName1 = "Lux"
      val productName2 = "Ultra Blends"
      val productName3 = "shirt"
      val count = 5
      val price1 = 20.0
      val price2 = 15.0
      val price3 = 150.0
      val price4 = 190.0
      val category1 ="toiletries"
      val category2 = "clothing"
      val category3 = "bags"
      val rating1 = 2
      val rating2 = 3
      val rating3 = 1
      val rating4 = 5
      val newCount = 0
      val orderCount = 6
      val sortType = "incr"
      val  soap = new Product(productId1, productName1, category1 , price1, rating1)
      val  soap2 = new Product(productId2, productName1,category1, price2, rating2)
      val shampoo = new Product(productId3,productName2 ,category1, price3, rating3)
      val shirt = new Product(productId4,productName3, category2 , price4, rating4)
      val productList = List(soap,soap2, shampoo, shirt)

      val soapCount = Inventory(productId1, count)
      val soap2Count = Inventory(productId2, count + rating1)
      val shampooCount = Inventory(productId3, count + rating3)
      val creamCount = Inventory(productId4, count + rating2)

      val inventoryList = List(soapCount, soap2Count, shampooCount)
      val newSoapCount = Inventory(productId1, newCount)
      val inventoryList2 = List(newSoapCount, soap2Count, shampooCount)

//    log.info("registering user User")
    userObject.register(userList,user4)

//    log.info("Authenticating User")
    val token = userObject.authenticate(userList,userName1, password1)

//    log.info("Search product by Category")

      productObject.searchByCategory(productList,category2)
      productObject.sortByPrice(productList,sortType)
//      log.info(productObject.sortByRating(productList,sortType))

//      log.info(inventoryObject.searchById(inventoryList,productId1))



    true
  }

}
