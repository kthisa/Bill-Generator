package Product.Laptop;

import Product.product;

public class laptop {
    public void laptopData()
        {
            product p = new product();
             for (int i =0;i<p.laptop_product.length;i++)
                 {
                    System.out.print(p.laptop_product[i] +"\t\t");
                }
        }
}
