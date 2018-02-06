package edu.knoldus.operation

import edu.knoldus.util.Product
import org.scalatest.FlatSpec

class ProductInventoryTest extends FlatSpec {

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

  val managementObject = new ProductOperation

  "searchById method" should "return the item that match it" in {
    assertThrows[Exception](managementObject.searchById(productList,productId4 + rating1 ))
    assert(managementObject.searchById(productList,productId1) == soap)
  }

  "searchCategory method" should "return the list of item that match it" in {
    assertThrows[Exception](managementObject.searchByCategory(productList, category3))
    assert(managementObject.searchByCategory(productList,category2) == List(shirt))
  }
  "sortByPrice method" should "return the item that match it" in {
    assert(managementObject.sortByPrice(productList,sortType) == List(shirt, shampoo, soap, soap2))
  }

  "sortByRating method" should "return the item that match it" in {
    assert(managementObject.sortByRating(productList,sortType) == List(shampoo, soap, soap2, shirt))
  }
}
