// BUILDING A SIMPLE CONSOLE BASED FOOD ORDERING SYSTEM ?
//given condition :- wallet balance --> ₹1000
/*
------ FOOD MENU ------

1. Check Wallet Balance
2. Add Money
3. Order Food
4. Exit

Enter your choice:
 */
import java.util.Scanner;
public class switchCaseNumberProblemNumber5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int walletBalance = 1000;
        int ch = 0;
        System.out.println("your Total wallet balance is " + walletBalance);
        while(ch != 4 ){
            System.out.println("---food menu----");
                System.out.println("1. Check Wallet Balance");
                System.out.println("2. Add Money");
                System.out.println("3. Order Food");
                System.out.println("4. Exit");
            System.out.println("Note please press 4 for exit after every order ");
            System.out.print("Enter your choice:- ");
            ch = sc.nextInt();

            switch (ch){
                case 1 :
                    System.out.println("you pressed 1 for to check the wallet balance");
                    System.out.println("Your wallet balance is " + 1000);
                    break;
                case 2 :
                    System.out.println("you pressed 2 for adding money in wallet balance");
                    int addbalance;
                    System.out.print("Enter your amount in ₹ to add a balance:- ");
                    addbalance = sc.nextInt();
                    walletBalance = walletBalance + addbalance;
                    System.out.println("Now your Total balance is " + walletBalance);
                    break;
                case 3 :
                    System.out.println("ordering of food ");
                    System.out.println("---food items---");
                    System.out.println("1. pizza --> ₹300");
                    System.out.println("2. Burger --> ₹200");
                    System.out.println("3. Pasta --> ₹250");
                    System.out.println("4. Sandwich --> ₹150");
                     int items = 0;
                    System.out.println("Enter your choice for ordering food ");
                    items = sc.nextInt();
                    switch (items){
                        case 1 :
                            System.out.println("Pizza ordering is under process....");
                            if (300 > walletBalance){
                                System.out.println("You are out of balance");
                            }
                            else {
                                System.out.println("order succeed");
                                walletBalance = walletBalance - 300;
                                System.out.println("Remainig wallet balance is ₹" + walletBalance);
                            }
                            break;
                        case 2 :
                            System.out.println("Burger ordering is under process...");
                            if (200 > walletBalance){
                                System.out.println("You are out of balance");
                            }
                            else {
                                System.out.println("order succeed");
                                walletBalance = walletBalance - 200;
                                System.out.println("Remainig wallet balance is ₹" + walletBalance);
                            }
                            break;
                        case 3 :
                            System.out.println("Pasta ordering is under process");
                            if (250 > walletBalance){
                                System.out.println("You are out of balance");
                                return;
                            }
                            else {
                                System.out.println("order succeed");
                                walletBalance = walletBalance - 250;
                                System.out.println("Remainig wallet balance is ₹" + walletBalance);
                            }
                            break;
                        case 4 :
                        System.out.println("Sandwich ordering is under process....");
                        if (150 > walletBalance){
                            System.out.println("You are out of balance");
                        }
                        else {
                            System.out.println("order succeed");
                            walletBalance = walletBalance - 300;
                            System.out.println("Remainig wallet balance is ₹" + walletBalance);
                        }
                        break;
                        default :
                            System.out.println("Invalid food option selected, Please try it again");
                            return;
                    }
                case 4:
                    System.out.println("Thank you for using our Food Ordering System!");
                    System.out.println("Goodbye!");
                    break;


                default:
                    System.out.println("enter valid option");
                    break;
//                default :
//                    if (items > 4) {
//                        System.out.println("invalid input ");
//                    }
//                    else{
//                    System.out.println();
//                }
//                    return;
            }


        }



    }
}
