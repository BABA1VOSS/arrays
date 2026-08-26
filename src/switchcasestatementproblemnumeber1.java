//question making a simple calculator
import java.util.Scanner;
public class switchcasestatementproblemnumeber1 {
    static void main() {
            System.out.println("   -----MENU-------   ");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBSTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION ");

            System.out.print("Enter your Operation :-");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
        System.out.print("Enter your number a:- ");
            int num1;
            num1= sc.nextInt();
        System.out.print("Enter your number b:- ");
        int num2;
         num2= sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Addition is " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Substraction is " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Multiplication is " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Division is " + (num1 / num2));
                    break;

                default:
                    System.out.println("Invalid operation selected ");
            }
            sc.close();


    }
}


