package edu.knoldus


import edu.knoldus.operation.{InventoryOperation, OperationOnUser, ProductOperation}
import edu.knoldus.util.{InventoryTrait, OperationOfUser, ProductTrait}

trait Creator {
  val inventoryObject: InventoryTrait = new InventoryOperation
  val productObject: ProductTrait = new ProductOperation
  val userObject: OperationOfUser = new OperationOnUser
}
