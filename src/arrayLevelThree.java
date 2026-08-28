//take 10 inputs
//calculate Total
//calculate avg
//Find max/min
//count each grade category
//count students above avg
// question --> printing of all of these
import java.util.Scanner;
import java.util.Arrays;
public class arrayLevelThree {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int [10];
        int sum = 0;
        double avg = 0;
        int n= marks.length;
        //Taking input ---> 10 inputs
        System.out.println("Enter the marks you obtained for each student");
        for (int i = 0; i<=n-1; i++) {
            marks[i] = sc.nextInt();
            // calculate Total marks
             sum = sum + marks[i];
             // To calculate avg
            avg = (double) sum /marks[i];
        }
        // claculating min max marks
        int maxMarks = marks[0];
        int minMarks = marks[0];
        for (int i =0; i<=n-1; i++){
            if (marks[i] > maxMarks){
                maxMarks = marks[i];
            }
            if (marks[i] < minMarks){
                minMarks = marks[i];
            }
        }
        //calculating students marks above avg

        int aboveAverageCount = 0;

        System.out.println("Marks above average are:");

        for (int i = 0; i < n; i++) {

            if (marks[i] > avg) {
                System.out.println(marks[i]);
                aboveAverageCount++;
            }
        }

        System.out.println("Students above average: " + aboveAverageCount);
         int count = 0;
         for (int i = 0; i <n; i++) {
             if (marks[i] > avg) {
                 count++;
             }
        }
         // calculating each grade category
        int excellent = 0;
        int veryGood = 0;
        int good = 0;
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < n; i++) {

            if (marks[i] >= 90 && marks[i] <= 100) {

                excellent++;

            } else if (marks[i] >= 75) {

                veryGood++;

            } else if (marks[i] >= 60) {

                good++;

            } else if (marks[i] >= 40) {

                pass++;

            } else {

                fail++;
            }
        }








        //printing of everything --->
        System.out.println("Marks obtained by each students are : - " + Arrays.toString(marks) +
                "\n" + "Total marks of the Students are : - " + sum + "\n" + "The average of the Students :-" + avg+ "\n" + "The maximum number is : - " + maxMarks + " \n" + "The minimum number is " + minMarks );
        System.out.println("How many marks are greater than avg "+ count);
        // ------  printing of grades ----
        System.out.println("----- printing of grades ");
        System.out.println("Excellent (90-100): " + excellent);

        System.out.println("Very Good (75-89): " + veryGood);

        System.out.println("Good (60-74): " + good);

        System.out.println("Pass (40-59): " + pass);

        System.out.println("Fail (Below 40): " + fail);

        sc.close();
    }
}
