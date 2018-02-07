package edu.knoldus.util

import org.scalatest.FlatSpec

class ProductTest extends FlatSpec {

  val productId1 = 123
  val productName1 = "Lux"
  val price1 = 20.0
  val category1 ="toiletries"
  val rating1 = 2
  val  soap = new Product(productId1, productName1, category1 , price1, rating1)

  "toString method" should "return the string contaning item detail" in {
    assert(soap.toString == "ProductID: 123 ProductName: Lux Category toiletries Price: 20.0 Rating: 2")
  }

}
