package Product.Tv;

import java.util.Scanner;

import Product.product;

public class tv {
    public String samsung_tv []= {"Samsung 8K & 4K TVs","Samsung Crystal UHD TVs","Samsung smart TV"};
    public int samsung_price [] = {14000, 35000,42000};
    public String sony_tv [] = {"Sony 8K & 4K TVs","Sony Crystal UHD TVs","Sony smart TV"};
    public int sony_price [] = {15000,36000,43000};
    public String lg_tv [] = {"LG 8K & 4K TVs","LG Crystal UHD TVs","Sony smart TV"};
    public int lg_price [] = {16000,37000,45000};
    public String brand;
    public String model;
    public int price;
    public int option;
    public String option2;
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
                brand = "Samsung";
                System.out.println("Available Televisions : ");
                for(int i =0;i < samsung_tv.length;i++)
                {
                    System.out.println(i+1+" "+samsung_tv[i]);
                }
                System.out.println("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = samsung_tv[option-1];
                price = samsung_price[option-1];
                System.out.println("The Cost of "+samsung_tv[option-1] + " is " + "Rs. "+samsung_price[option-1]);
                break;
            case 2:
                brand = "Sony";
                System.out.println("Available Televisions : ");
                for(int i = 0;i < sony_tv.length;i++)
                {
                    System.out.println(i+1+" "+sony_tv[i]);
                }
                System.out.println("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = sony_tv[option-1];
                price = sony_price[option -1];
                System.out.println("The Cost of "+sony_tv[option-1] + " is " + "Rs. "+sony_price[option-1]);
                break;
            case 3:
                brand = "LG";
                System.out.println("Available Television : ");
                for(int i = 0;i < lg_tv.length;i++)
                {
                    System.out.println(i+1+" "+lg_tv[i]);
                }
                System.out.println("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = lg_tv[option-1];
                price = lg_price[option-1];
                System.out.println("The Cost of "+lg_tv[option-1] + " is " + "Rs. "+lg_price[option-1]);        
                break;
            default:
                break;
        }
       
    }
}
