package Product;

public class product {
   public String products[] = { "Mobile","TV","Laptop"};
   public String mobile_product[] = { "Oneplus","Vivo","Redmi"};
   public String laptop_product[] = { "Acer", "HP", "Dell"};
   public String tv_product[] = { "Samsung", "LG", "Sony"};
   public String selectedProduct;
   //same above line for tv ,lap
    public void productList()
    {
        for (int i =0;i<products.length;i++)
        {
            System.out.print(products[i] + " \t\t ");
        }
    }
}
