import java.util.Scanner;

//------ BANK MENU ------
//
//1. Check Balance
//2. Deposit Money
//3. Withdraw Money
//4. Change PIN
//5. Exit
//
//Enter your choice:
public class switchCaseProblemNumber6 {
    public static void main(String[] args) {
        int bal = 10000;
        String pass= "1234";
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        boolean loginSuccessful = false;
        while (attempt < 3) {
            System.out.println("Enter your Pin :- ");
            String in = sc.nextLine();
            if (in.equals(pass)) {
                System.out.println("login authentication Successful");
                break;
            } else {
                System.out.println("login authentication failed");
                attempt++;
                System.out.println("reamining attempt" + (3 - attempt));
            }
        }
        int ch = 0;
        while (ch < 5) {

            System.out.println("Entering to Banking system");
        System.out.println("------ BANK MENU ------\n" +
                "1. Check Balance\n" +
                "2. Deposit Money\n" +
                "3. Withdraw Money\n" +
                "4. Change PIN\n" +
                "5. Exit");

            System.out.println("Enter your choice");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Your balance is ₹" + bal);
                    break;
                case 2:
                    int dep = 0;
                    System.out.println("Enter your deposit amount");
                    dep = sc.nextInt();
                    if (dep > 0) {
                        bal = dep + bal;
                        System.out.println("Your deposit amount is " + dep + "\n" + "Total balance: " + bal);
                        break;
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;
                case 3:
                    int withdraw = 0;
                    System.out.println("Enter your Withdraw amount");
                    withdraw = sc.nextInt();
                    if (withdraw > 0 ){
                        System.out.println("your withdrawl amount is " + withdraw +"\n" +"your remaining balance is "+ (bal - withdraw));
                    }
                    else {
                        System.out.println("print in sufficient balance ");
                    }
                    break;
                case 4 :
                    // changing of pin
//                    the real problem is actually sc.nextInt() is came for number only and \n is the String part so it runs into it , thats why it leads to Scnaner problem
                    //the solution for this is add sc.nextLine() for stringt after sc.nextInt()
                    System.out.println("For changing of new pin ");
                    System.out.println("Enter your current password");
                            String currpass= sc.nextLine();
                    if (currpass.equals(pass)) {
                        System.out.println("Generate your new Pin");
                        String newpass=  sc.nextLine();
                        System.out.println("Renter your new pass");
                        String againnewpass = sc.nextLine();
                        if (againnewpass.equals(newpass)){
                            System.out.println("password changed successfully");
                            pass = newpass;
                        }
                        else {
                            System.out.println("wrong password detected " + "\n" + "password is not changed" );
                            return;
                        }
                    }else {
                        System.out.println("wrong pass entered , please enter your prev pass");
                        return;
                    }
                    break;

                case 5 :
                    System.out.println("Thanks for visiting us ");
                    break;
                default:
                    System.out.println("please select some valuable operation from 1 to 4 and press 5 for exit");
            }


        }
        sc.close();

    }
}