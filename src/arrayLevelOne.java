//question number 1 ---> making of student marks analyzer with taking 5 input from user
//then calculate ---> 1. total marks ;    2. Average
import java.util.Arrays;
import java.util.Scanner;
public class arrayLevelOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int avg = 0;
        System.out.println("Input your numbers");
        int [] numbers = new int [5];
//        taking inpujt from the user

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
            avg = sum / numbers.length;

        }
        System.out.println("your numbers are : - " + Arrays.toString(numbers) + " your sum is " + sum + "\n your avg is " + avg );


    }
}
