import java.util.Arrays;
import java.util.Scanner;

public class arrayLevelTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int [10];
        int n = numbers.length;

        System.out.println("Enter your marks for each student:-");
        for (int i =0; i< n-1; i++ ) {
            numbers[i] = sc.nextInt();
        }
        int maxMark = numbers[0];
        int minMark = numbers[0];
        for (int i =0; i< n-1; i++ ) {

            if (numbers[i] > maxMark) {
                maxMark = numbers[i];
            }
            if (numbers[i] < minMark) {
                minMark = numbers[i];
            }
        }
        for (int i= 0; i<n-1; i++){
            if (numbers[i]> 70) {
                System.out.print("numbers greater than 70 < " + numbers[i] + " \n");
            }
        }
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] > 70) {
                count++;
            }
        }

        System.out.println("printing of each students marks " + Arrays.toString(numbers));
        System.out.println("The maximum marks is :-"+maxMark +"\n"+ "The minimum marks is :-" + minMark);
        System.out.println("Total numbers count greater than 70  is :-  " + count);
    }
}
