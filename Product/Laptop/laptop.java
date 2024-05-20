package Product.Laptop;

import java.util.Scanner;

import Product.product;

public class laptop {
    public String acer_avail []= {"Swift 3","Swift Go 14","Swift Go 16"};
    public int acer_price [] = {80000, 75000,92000};
    public String hp_avail [] = {"HP Pavilion","HP Victus","HP Omen"};
    public int hp_price [] = { 70000,80000,85000};
    public String del_avail [] = {"del 2","del 1","del 3"};
    public int del_price [] = {80000,85000,79000};
    public String brand;
    public String model;
    public int price;
    public int option;
    public String option2;
    public void laptopMenu()
        {
            System.out.println(" ");
            System.out.println("LAPTOP MENU");
            System.out.println("1. Acer");
            System.out.println("2. HP");
            System.out.println("3. Dell");
            System.out.print("Please Enter Your Choice: ");
            System.out.println(" ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Available Laptops : ");
                for(int i =0;i < acer_avail.length;i++)
                {
                    System.out.println(i+1+" "+acer_avail[i]);
                }
                System.out.println(" ");
                System.out.print("Please Enter Your Choice: ");
                int option = scan.nextInt();
                option = scan.nextInt();
                model = acer_avail[option-1];
                price = acer_price[option-1];
                System.out.println(" ");
                System.out.println("The Cost of "+acer_avail[option-1] + " is " + "Rs. "+acer_price[option-1]);
                break;
            case 2:
                brand = "Hp";
                System.out.println("Available Laptops : ");
                for(int i = 0;i < hp_avail.length;i++)
                {
                    System.out.println(i+1+" "+hp_avail[i]);
                }
                System.out.print("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = hp_avail[option-1];
                price = hp_price[option -1];
                System.out.println(" ");
                System.out.println("The Cost of "+hp_avail[option-1] + " is " + "Rs. "+hp_price[option-1]);
                break;
            case 3:
                brand = "Dell";
                System.out.println("Available Laptops : ");
                for(int i = 0;i < del_avail.length;i++)
                {
                    System.out.println(i+1+" "+del_avail[i]);
                }
                System.out.print("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = del_avail[option-1];
                price = del_price[option-1];
                System.out.println(" ");
                System.out.println("The Cost of "+del_avail[option-1] + " is " + "Rs. "+del_price[option-1]);
                break;
            default:
                break;
            }
        }
}
