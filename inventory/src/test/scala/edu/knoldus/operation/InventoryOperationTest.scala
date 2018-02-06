package edu.knoldus.operation

import edu.knoldus.util.{Inventory, Product}
import org.scalatest.FlatSpec

class InventoryOperationTest extends FlatSpec{
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
  val rating1 = 2
  val rating2 = 3
  val rating3 = 1
  val rating4 = 5
  val newCount = 0
  val orderCount = 6
  val  soap = new Product(productId1, productName1, category1 , price1, rating1)
  val  soap2 = new Product(productId2, productName1,category1, price2, rating2)
  val shampoo = new Product(productId3,productName2 ,category2, price3, rating3)
  val cream = new Product(productId4,productName3, category1 , price4, rating4)
  val productList = List(soap,soap2, shampoo, cream)

  val soapCount = Inventory(productId1, count)
  val soap2Count = Inventory(productId2, count + rating1)
  val shampooCount = Inventory(productId3, count + rating3)
  val creamCount = Inventory(productId4, count + rating2)

  val inventoryList = List(soapCount, soap2Count, shampooCount)
  val newSoapCount = Inventory(productId1, newCount)
  val inventoryList2 = List(newSoapCount, soap2Count, shampooCount)
  val managementObject = new InventoryOperation


  "updateInventory method" should "return updated list" in {
    assertThrows[Exception](managementObject.updateInventory(inventoryList,productId1, orderCount))
    assert(managementObject.updateInventory(inventoryList,productId1, count) == inventoryList2 )
  }


   "searchById method" should "return the item that match it" in {
    assertThrows[Exception](managementObject.searchById(inventoryList,productId4 + rating1 ))
    assert(managementObject.searchById(inventoryList,productId1) == soapCount)
  }
}
