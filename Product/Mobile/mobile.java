package Product.Mobile;

import java.util.Scanner;

import Product.product;

public class mobile {
    public String oneplus_phone []= {"Oneplus Nord","Oneplus 7T","Oneplus Nord2"};
    public int oneplus_price [] = {30000, 35000,42000};
    public String vivo_phone []= {"Vivo Y12","Vivo Y13","Vivo Y14"};
    public int vivo_price [] = {31000, 36000,41000};
    public String oppo_phone []= {"Oppo Reno 10","Oppo Reno 11 ","Oppo Reno 12"};
    public int oppo_price [] = {32000, 37000,43000};
    public String brand;
    public String model;
    public int price;
    public int option;
    public String option2;
    public void mobileMenu()
    {
        System.out.println("MOBILE MENU");
        System.out.println("1. Oneplus");
        System.out.println("2. Vivo");
        System.out.println("3. Oppo");
        System.out.println("Please Enter Your Choice: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                brand = "Oneplus";
                System.out.println("Available Phones : ");
                for(int i = 0;i < oneplus_phone.length;i++)
                {
                    System.out.println(i+1+" "+oneplus_phone[i]);
                }
                System.out.println("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = oneplus_phone[option-1];
                System.out.println("The Cost of "+oneplus_phone[option-1] + " is " + "Rs. "+oneplus_price[option-1]);
                System.out.println("Do you wish to Proceed (y/n): ");
                option2 = scan.nextLine();
                if (option2 == "y")
                {
                    price = oneplus_price[option-1];   
                }
                else if(option2 == "n")
                {
                 return;
                }
                break;
            case 2:
                brand = "Vivo";
                System.out.println("Available Phones : ");
                for(int i = 0;i < vivo_phone.length;i++)
                {
                    System.out.println(i+1+" "+vivo_phone[i]);
                }
                System.out.println("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = vivo_phone[option-1];
                System.out.println("The Cost of "+vivo_phone[option-1] + " is " + "Rs. "+vivo_price[option-1]);
                System.out.print("Do you wish to Proceed (y/n): ");
                option2= scan.next();
                if (option2 == "y")
                {
                    price = vivo_price[option-1];   
                }
                else if(option2 == "n")
                {
                 return;
                }
                break;
            case 3:
                brand = "Oppo";
                System.out.println("Available Phones : ");
                for(int i = 0;i < oppo_phone.length;i++)
                {
                    System.out.println(i+1+" "+oppo_phone[i]);
                }
                System.out.println("Please Enter Your Choice: ");
                option = scan.nextInt();
                model = oppo_phone[option-1];
                System.out.println("The Cost of "+oppo_phone[option-1] + " is " + "Rs. "+oppo_price[option-1]);
                System.out.println("Do you wish to Proceed (y/n): ");
                option2 = scan.nextLine();
                if (option2 == "y")
                {
                    price = oppo_price[option-1];   
                }
                else if(option2 == "n")
                {
                 return;
                }
                break;
            default:
                break;
        }
        System.out.println("Enter your choice : ");
    }
}
