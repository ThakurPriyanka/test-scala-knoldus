package edu.knoldus

import edu.knoldus.util.{Inventory, InventoryTrait}

class InventoryOperation extends InventoryTrait {

  def updateInventory(itemOldList: List[Inventory], productId: Int, count: Int): List[Inventory] = {

    def update(itemList: List[Inventory], productId: Int, count: Int, newItemList: List[Inventory]): List[Inventory] = {
      itemList match {
        case item :: itemRestList if item.productId == productId => val newCount = item.count - count
          if (newCount >= 0) {
            val newItem = item.copy(count = newCount)
            newItem :: itemRestList
          }
          else {
            throw new Exception("Cannot add product in the  list")
          }
        case item :: itemRestList => update(itemRestList, productId, count, item :: newItemList)
        case Nil if (newItemList != itemOldList) => {
          throw new Exception("item does not exits")
        }
      }
    }

    update(itemOldList, productId, count, List())
  }

  def searchById(itemList: List[Inventory], productId: Int): Inventory = {
    val item = itemList.reduceLeft((x, y) => if (x.productId == productId) x else y)
    if (item.productId != productId) {
      throw new Exception("Can not found it")
    }
    else {
      item
    }
  }
}
