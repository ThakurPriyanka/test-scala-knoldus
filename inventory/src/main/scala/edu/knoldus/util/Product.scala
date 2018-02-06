package edu.knoldus.util

case class Product(productId: Int, productName: String, category: String, price: Double, rating: Int) {
  override def toString(): String = {
    s"ProductID: $productId ProductName: $productName Category $category Price: $price Rating: $rating"
  }
}
