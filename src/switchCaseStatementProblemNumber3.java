//LEVEL 2 ATM
//Question - In an ATM user can perform different operations multiples times
import java.util.Scanner;
public class switchCaseStatementProblemNumber3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int ch = 0;
        while (ch != 4 ) {
            System.out.println("------MENU------");
            System.out.println("1.checkbalance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            System.out.println("Enter your choice ");
            ch = sc.nextInt();

            /* it can be done through the loops  like this */
//             ch = sc.nextInt();
//            if (ch == 1) {
//                System.out.println("your balance is " + balance);
//            } else if (ch == 2) {
//                System.out.println("j");
//              }

            switch (ch) {
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
                    break;
                default :
                    System.out.println("invalid operation");

            }
        }
        sc.close();
    }
}

