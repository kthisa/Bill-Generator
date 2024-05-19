package Product;

import java.util.Scanner;

import Product.Laptop.laptop;
import Product.Mobile.mobile;
import Product.Tv.tv;

public class product {
    public String brand;
    public String model;
    public int price;
    public float discount = 5;
    public float finalPrice;
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
                brand = m.brand;
                model = m.model;
                price = m.price;
                break;
            case 2:
                tv t = new tv();
                t.tvMenu();
                brand = t.brand;
                model = t.model;
                price = t.price;
                break;
            case 3:
                laptop l = new laptop();
                l.laptopMenu();
                brand = l.brand;
                model = l.model;
                price = l.price;
                break;
            default:
                break;
        }
        System.out.println("-----" +brand+ "-----");
        System.out.println("Brand Name \t: "+brand);
        System.out.println("Model Name \t: "+model);
        System.out.println("Price \t\t: "+price);
        System.out.println("Discount \t: "+discount+ "%");
        float discount_amount = (price)*(discount/100);
        System.out.println("Discount Amount : "+discount_amount);
        finalPrice = price - discount_amount;
        System.out.println("Final Price \t: "+finalPrice);
    }
}
