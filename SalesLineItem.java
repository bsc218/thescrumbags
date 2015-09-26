public class SalesLineItem {
  ProductDescription prod;
  int qty;
  Money subtotal;

  //creates SalesLineItem object given a product description and quantity
  public SalesLineItem(ProductDescription prod, int qty) {
    this.prod = prod;
    this.qty = qty;
  }

  //calculates the subtotal of a SalesLineItem object
  public float getSubtotal() {
    return prod.getPrice() * qty;
  }
}
