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
        System.out.println(" ");
        System.out.println("Do you wish to continue (y/n): ");
        Scanner s = new Scanner(System.in);
        String choose = s.nextLine();
        System.out.println("--------------------  Buy Now  -------------------");
        System.out.print("\nFull Name \t: ");
        String fullname = scan.nextLine();
        System.out.print("\nMobile Number \t: ");
        String mobile = scan.nextLine();
        System.out.print("\nAddress \t: ");
        String address = scan.nextLine();
        System.out.print("\nQuantity \t: ");
        int quant = scan.nextInt();
        System.out.println("--------------------  Bill  -------------------"); 
        System.out.println("Full Name \t: "+fullname);
        System.out.println("Mobile Number \t: "+mobile);
        System.out.println("Address \t: "+address);
        System.out.println("Product Details : "+model);
        System.out.println("Quantity \t: "+quant);
        System.out.println("Total Price \t: "+quant * price);
        // System.out.println(fullname+"\t");
        // System.out.println(mobile+"\t");
        // System.out.println(address+"\t");
        // System.out.println(model+"\t");
        // System.out.println(quant+"\t");
        // System.out.println(quant*price);
        System.out.println("-------------------  Thank You  ------------------");
    }
}
