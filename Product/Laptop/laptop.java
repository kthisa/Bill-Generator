package Product.Laptop;

import java.util.Scanner;

import Product.product;

public class laptop {
    public String acer_avail []= {"Swift 3","Swift Go 14","Swift Go 16"};
    public int acer_price [] = {80000, 75000,92000};
    public String brand;
    public String model;
    public int price;
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
                // System.out.println("Please Enter Your Choice: ");
                // int option = scan.nextInt();
                // model = oneplus_phone[option-1];
                // System.out.println("The Cost of "+oneplus_phone[option-1] + "is " + "Rs. "+oneplus_price[option-1]);
                // System.out.println("Do you wish to Proceed (y/n): ");
                // String option2 = scan.nextLine();
                // if (option2 == "y")
                // {
                //     price = oneplus_price[option-1];   
                // }
                // else if(option2 == "n")
                {
                 return;
                }
                
                
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
