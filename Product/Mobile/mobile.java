package Product.Mobile;

import java.util.Scanner;

import Product.product;

public class mobile {
    public String oneplus_phone []= {"Oneplus Nord","Oneplus 7T","Oneplus Nord2"};
    public int oneplus_price [] = {30000, 35000,42000};
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
                System.out.println("Available Phones : ");
                for(int i =0;i < oneplus_phone.length;i++)
                {
                    System.out.println(i+1+" "+oneplus_phone[i]);
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
