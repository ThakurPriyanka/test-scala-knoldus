package edu.knoldus

import edu.knoldus.util.{Product, ProductTrait}

class ProductOperation extends ProductTrait {

  def searchById(itemList: List[Product], productId: Int): Product = {
    val item = itemList.reduceLeft((x, y) => if (x.productId == productId) x else y)
    if (item.productId == productId ){
      item
    }
    else {
      throw new Exception("Can not find the product")
    }
  }

  def searchByCategory(itemList: List[Product], category: String): List[Product] = {

    val newItemList = for (item <- itemList if item.category == category) yield item
    if (newItemList != List()){
      newItemList
    }
    else {
      throw new Exception("Can not find the product")
    }
  }

  def sortByPrice(itemList: List[Product], typeOfSort: String): List[Product] = {
    typeOfSort match {
      case "incr" => itemList.sortWith((x,y)=> x.price > y.price)
      case "decr" => itemList.sortWith((x,y)=> x.price < y.price)
    }
  }

  def sortByRating(itemList: List[Product], typeOfSort: String): List[Product] = {
    typeOfSort match {
      case "incr" => itemList.sortWith((x,y)=> x.rating < y.rating)
      case "decr" => itemList.sortWith((x,y)=> x.rating > y.rating)
    }
  }
}

