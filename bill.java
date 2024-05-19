import java.util.Scanner;

import Product.product;

public class bill {
    public String brand;
    public String model;
    public float price;
    public void bill()
    {
        product p = new product();
        p.productMenu();
        brand = p.brand;
        model = p.model;
        price = p.finalPrice;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nFull Name : ");
        String fullname = scan.nextLine();
        System.out.print("\nMobile Number : ");
        String mobile = scan.nextLine();
        System.out.print("\nAddress : ");
        String address = scan.nextLine();
        System.out.print("\nQuantity : ");
        int quant = scan.nextInt();
        System.out.println(); 
        System.out.println("Full Name : \t");
        System.out.println("Mobile Number : \t");
        System.out.println("Address : \t");
        System.out.println("Product Details : \t");
        System.out.println("Quantity : \t");
        System.out.println("Total Price : \t");
        System.out.print(fullname+"\t\t");
        System.out.println(mobile+"\t\t");
        System.out.println(address+"\t\t");
        System.out.println(model+"\t\t");
        System.out.println(quant+"\t\t");
        System.out.println(quant*price);
    }
}
