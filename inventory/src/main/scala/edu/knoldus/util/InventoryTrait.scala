package edu.knoldus.util

trait InventoryTrait {
  def updateInventory(itemOldList: List[Inventory], productId: Int, count: Int): List[Inventory]
  def searchById(itemList: List[Inventory], productId: Int): Inventory
}
