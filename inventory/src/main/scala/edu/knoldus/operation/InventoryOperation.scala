package edu.knoldus.operation

import edu.knoldus.util.{Inventory, InventoryTrait}

class InventoryOperation extends InventoryTrait {

    def updateInventory(itemOldList: List[Inventory], productId: Int, count: Int): List[Inventory] = {

      def update(itemOldList: List[Inventory], productId: Int, count: Int, newItemList: List[Inventory]): List[Inventory] = {
        itemOldList match {
          case item :: itemOldList =>
            if (item.productId == productId) {
              val newCount = item.count - count
              if (newCount >= 0) {
                val newItem = item.copy(count = newCount)
                newItem :: itemOldList
              }
              else {
                throw new Exception("Cannot add product in the  list")
              }
            }
            else {
              update(itemOldList,productId,count,item :: newItemList)
            }
          case Nil => newItemList
        }
      }
      update(itemOldList,productId,count, List())
    }

    def searchById(itemList: List[Inventory], productId: Int): Inventory = {
      val item = itemList.reduceLeft((x,y) => if (x.productId == productId) x else y )
      if(item.productId != productId) {
        throw new Exception("Can not found it")
      }
      else {
        item
      }
    }
}
