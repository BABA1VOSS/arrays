//ATM MACHINE
//user balance = ₹10000
// options --> 1. check balance
   //          2. Deposit money
//             3. Withdraw money
//             4.exit
import java.util.Scanner;
public class switchCaseStatementProblemNumber2 {
    static void  main() {
        int balance = 10000;
        System.out.println("------MENU------");
        System.out.println("1.checkbalance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        System.out.println("Enter your choice ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("your balamce is :" + "₹" + balance);
             break;
            case 2:
                System.out.println("Enter your deposit money");
                int deposit;
                 deposit = sc.nextInt();
                 balance = balance +deposit;
                System.out.println("Your deposit amount is " + deposit);
                System.out.println("Your total balance is now " + balance);
                break;
            case 3:
                System.out.println("Enter your withdrawl money");
                int withdrawl;
                withdrawl = sc.nextInt();
                if (withdrawl > balance){
                    System.out.println("insufficient balance");
                } else {
                balance = balance - withdrawl;
                System.out.println("Your withdrawal amount is " + withdrawl);
                System.out.println("Your total balance is now " + balance);
                break;
                }
            case 4 :
                System.out.println("Exit");
                return;
            default :
                System.out.println("invalid operation");

        }
        sc.close();


    }
}
