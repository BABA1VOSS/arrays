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


            }


        }

    }
}