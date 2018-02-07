package util

case class Cart(cardId: String, mobileNumber: String, productList: List[Product]) {
  override def toString: String = {
    s"cardId: $cardId mobileNumber: $mobileNumber productList $productList"
  }

}
