
import edu.knoldus.operation.{ProductOperation, InventoryOperation}
import edu.knoldus.util.{InventoryTrait, ProductTrait}

trait InventoryCreation {
  val inventoryObject: InventoryTrait = new InventoryOperation
  val productObject: ProductTrait = new ProductOperation
}
