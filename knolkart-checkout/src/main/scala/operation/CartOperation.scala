package operation

import edu.knoldus.util.{Inventory, Product}
import util.OperationOfCart

class CartOperation extends OperationOfCart {

  def addToCart(productList: List[Product], newProduct: Product): (List[Product], Double) ={
    val newProductList = productList ::: List(newProduct)
    val totalAmount = newProductList.map(product => product.price).sum
    (newProductList, totalAmount)
  }
  def removeFromCart(productList: List[Product], newProduct: Product): (List[Product], Double) ={

    val newProductList = productList.filter(product => product.productId != newProduct.productId)
    val totalAmount = newProductList.map(product => product.price).sum
    (newProductList, totalAmount)

  }
  def placeOrder(productList: List[Product], inventoryList: List[Inventory]): String = {

  "last"

  }

}
