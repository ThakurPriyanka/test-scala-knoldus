package util

import edu.knoldus.util.{Inventory, Product}


trait OperationOfCart {

  def addToCart(productList: List[Product], newProduct: Product): (List[Product], Double)
  def removeFromCart(productList: List[Product], newProduct: Product): (List[Product], Double)
  def placeOrder(productList: List[Product], inventoryList: List[Inventory]): String
}
