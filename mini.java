import java.util.Scanner;

import Product.product;
// import Product.Laptop.laptop;
// import Product.Mobile.mobile;
// import Product.Tv.tv;

public class mini {

    public static void main(String[] args) {
        // System.out.println("-------------Welcome to Smart Home-----------");
        // System.out.println(" ");
        // System.out.println(" ");

        // product p = new product();
        // p.productList();
        
        // Scanner scan = new Scanner(System.in);
        // System.out.println(" ");
        // System.out.println(" ");
        // System.out.println("Pick one : ");
        // p.selectedProduct = scan.nextLine();
        // System.out.println(" ");
    
        // if(p.selectedProduct.equals("Mobile"))
        // {
        //     mobile m = new mobile();
        //     m.mobileData();

        // }
        // else if(p.selectedProduct.equals("Laptop"))
        // {
        //     laptop l = new laptop();
        //     l.laptopData();
        // }
        // else 
        // {
        //     tv t = new tv();
        //     t.tvData();
        // }
        // String things = scan.nextLine();
        // System.out.println("You chose " +things + ". Do you wish to Continue(y/n) : ");
        // String choice = scan.nextLine();
        // if (choice == "y")
        // {
        //     // do nothing
        // }
        // else if(choice == "n")
        // {
        //     return;
        // }
        product p = new product();
        p.productMenu();
    }
}