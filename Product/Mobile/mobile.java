package Product.Mobile;

import Product.product;

public class mobile {
    public void mobileData()
    {
        product p = new product();
        for (int i =0;i<p.mobile_product.length;i++)
        {
            System.out.print(p.mobile_product[i] +"\t\t");
        }
    }
}
