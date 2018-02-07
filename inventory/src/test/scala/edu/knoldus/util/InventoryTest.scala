package edu.knoldus.util

import org.scalatest.FlatSpec

class InventoryTest extends FlatSpec {

  val productId1 = 123
  val count = 5
  val soapCount = Inventory(productId1, count)

  "toString method" should "return the string containing inventory detail" in {
    assert(soapCount.toString == "ProductID: 123 Product Count: 5")
  }

}
