package edu.knoldus.util

trait ProductTrait {
  def searchById(itemList: List[Product], productId: Int): Product
  def searchByCategory(itemList: List[Product], category: String): List[Product]
  def sortByPrice(itemList: List[Product], typeOfSort: String): List[Product]
  def sortByRating(itemList: List[Product], typeOfSort: String): List[Product]
}
