package Product.Laptop;

import java.util.Scanner;

import Product.product;

public class laptop {
    public String acer_avail []= {"Swift 3","Swift Go 14","Swift Go 16"};
    public int acer_price [] = {80000, 75000,92000};
    public void laptopMenu()
        {
            System.out.println("LAPTOP MENU");
            System.out.println("1. Acer");
            System.out.println("2. HP");
            System.out.println("3. Dell");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Available Laptops : ");
                for(int i =0;i < acer_avail.length;i++)
                {
                    System.out.println(i+1+" "+acer_avail[i]);
                }
                break;
            case 2:
            // do nothing
            break;
            case 3:
            // do 
            break;
            default:
                break;
        }
            System.out.print("Enter your choice : ");
        }
}
