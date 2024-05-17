package Product;

import java.util.Scanner;

import Product.Laptop.laptop;
import Product.Mobile.mobile;

public class product {
//    public String products[] = { "Mobile","TV","Laptop"};
//    public String mobile_product[] = { "Oneplus","Vivo","Redmi"};
//    public String laptop_product[] = { "Acer", "HP", "Dell"};
//    public String tv_product[] = { "Samsung", "LG", "Sony"};
//    public String selectedProduct;
   //same above line for tv ,lap
    public void productMenu()
    {
        System.out.println("PRODUCT MENU");
        System.out.println("1. Mobile");
        System.out.println("2. TV");
        System.out.println("3. Laptop");
        System.out.println("Please Enter Your Choice : ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                mobile m = new mobile();
                m.mobileMenu();
                break;
            case 2:
                // tv t = new tv();
                // t.tvMenu();
                break;
            case 3:
                laptop l = new laptop();
                l.laptopMenu();
                break;
            default:
                break;
        }
    }
}
