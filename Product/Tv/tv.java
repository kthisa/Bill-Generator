package Product.Tv;

import java.util.Scanner;

import Product.product;

public class tv {
    public String samsung_tv []= {"Samsung 8K & 4K TVs","Samsung Crystal UHD TVs","Samsung smart TV"};
    public int samsung_price [] = {14000, 35000,42000};
    public void tvMenu()
    {
        System.out.println("TELEVISION MENU");
        System.out.println("1. Samsung");
        System.out.println("2. Sony");
        System.out.println("3. LG");
        System.out.println("Please Enter Your Choice: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Available Televisions : ");
                for(int i =0;i < samsung_tv.length;i++)
                {
                    System.out.println(i+1+" "+samsung_tv[i]);
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
        System.out.println("Enter your choice : ");
    }
}
