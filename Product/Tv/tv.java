package Product.Tv;

import Product.product;

public class tv {
    public void tvData()
    {
        product p = new product();
        for (int i =0;i<p.tv_product.length;i++)
        {
            System.out.print(p.tv_product[i] +"\t\t");
        }
    }
}
