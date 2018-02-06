package edu.knoldus.util

case class Inventory(productId: Int, count: Int) {
  override def toString(): String = {
    s"ProductID: $productId Product Count: $count"
  }
}
