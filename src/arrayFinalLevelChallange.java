import java.util.Scanner;
import java.util.Arrays;

//Q-> input all 20 marks
// print the complete matrix
// calculate each Students total
//each Student avg
//find the topper
//Highest individual marks
//Lowest individual marks
// count passing Student
// also calculate the class avg.
public class arrayFinalLevelChallange {
    public static void main(String[] args) {
        int arr[][] = new int[5][4];
        Scanner sc = new Scanner(System.in);
//using of for loops for both the inner and outer loop or we also known as i and j
        //for i loop
        for (int i = 0; i < arr.length; i++) {
            //for j loop
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Provide value for row= " + i + " and column=" + j);
                arr[i][j] = sc.nextInt();
            }
        } //Hume isko alag se hi print karvana padega issi mein karenge values bar bar print hoti rehti hai or itna hi ni agar ek loop ko lete hai to fir usme ek ko detect ni karta hai
        //print //printing ke lie alag se method dalna padta hai iska jaise ki abhi mene kia hai isme bhi alag rows and columns ke lie alag for loops ka use hota hai
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + "  ");
            }
            System.out.println();
        }
        //To Calculate Each Students Total
        for (int i = 0; i< arr.length; i++){
            int sum = 0;
            double avg = 0;
            for (int j = 0; j<arr[i].length; j++){
                sum = sum + arr[i][j];
                avg = (double)sum / arr[i].length; //mene 4 likha tha kyunki 4 subj the lekin yeh likhunga arr[i].length to bht badia rhega bar bar subject nahi ginne padenge
            }
            System.out.println("Students " + (i +1) + " marks " + sum);
            System.out.println("Students " + (i+1) + " avg "+ avg);
        }
        //calculating each Students avg
        // same trick to be applied because i is students and j is marks , avg is applied on marks
        //continuing the loops again

       //M avg bhi uper hi calculate kar deta hu fir to kyunki marks ke sum ki jarurat to mujhe padegi hi fir se.. baakli iski alternate technique dhundh leta hu ki is loop ka samaan bahr uss loop mein kaise use karu ----> bhai aisi koi trick nahi hai , Scope ke bahar nikle bina purane variables ko zinda rakhne ka koi shortcut nahi hai, Java mein aisi koi trick nahi hai. Java ke Block Scope rules bohot strict hote hain, aur iska seedha sa rule hai: jo variable jis curly braces {} ke andar declare hota hai, uski zindagi wahi shuru aur wahi khatam hoti hai.


        // finding of highest individual marks
        for (int i=0; i<arr.length; i++){
            int maxValue=arr[0][0];
            int top = 0;
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    top++;
                }
            }
            System.out.println("Highest mark scored by student n0. " + (i+1) + " " + maxValue);
            System.out.println("topper is " + top);

        }

        for (int i = 0; i< arr.length; i++){
            int minValue = arr[0][0];
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < minValue){
                    minValue = arr[i][j];
                }
            }
            System.out.println("Highest mark scored by student n0. "  + " " + minValue);
        }
        // Class avg
//        int avg = 0;
//        int sum = 0;
        // for this we use to do sum and avg so we first calculate the sum and avg
//        for (int i =0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                sum = sum + arr[i][j];
//                avg = sum/arr.length;
//            }
//        }
//        System.out.println("The sum is " + sum +"\n"+ "The avg is " + avg );


        for (int i =0; i< arr.length; i++){
            int pass = 0;
            int fail = 0;
            for (int j = 0; j<arr[i].length; j++){
                if (arr[i][j] > 40){
                    pass++;
                }
                else {
                    fail++;
                }
            }
            System.out.println("Pass (40-100): " + pass);

            System.out.println("Fail (Below 40): " + fail);
        }





// yaha se sara sahi code hai isko kal mein dubara karunga








        // ------------------------------------------------
        // 3. STUDENT TOTAL AND AVERAGE
        // ------------------------------------------------

        System.out.println("\n----- STUDENT TOTAL & AVERAGE -----");

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {

                sum = sum + arr[i][j];
            }

            double avg = (double) sum / arr[i].length;

            System.out.println(
                    "Student " + (i + 1) +
                            " Total = " + sum
            );

            System.out.println(
                    "Student " + (i + 1) +
                            " Average = " + avg
            );
        }


        // ------------------------------------------------
        // 4. FIND TOPPER
        // ------------------------------------------------

        int highestTotal = 0;
        int topper = 0;

        for (int i = 0; i < arr.length; i++) {

            int studentTotal = 0;

            for (int j = 0; j < arr[i].length; j++) {

                studentTotal = studentTotal + arr[i][j];
            }

            if (studentTotal > highestTotal) {

                highestTotal = studentTotal;
                topper = i + 1;
            }
        }

        System.out.println("\nTopper = Student " + topper);
        System.out.println("Highest Total = " + highestTotal);


        // ------------------------------------------------
        // 5. HIGHEST INDIVIDUAL MARK
        // ------------------------------------------------

        int highestMark = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > highestMark) {

                    highestMark = arr[i][j];
                }
            }
        }

        System.out.println(
                "Highest individual mark = " + highestMark
        );


        // ------------------------------------------------
        // 6. LOWEST INDIVIDUAL MARK
        // ------------------------------------------------

        int lowestMark = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < lowestMark) {

                    lowestMark = arr[i][j];
                }
            }
        }

        System.out.println(
                "Lowest individual mark = " + lowestMark
        );


        // ------------------------------------------------
        // 7. COUNT PASSING STUDENTS
        // ------------------------------------------------

        int passingStudents = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean passed = true;

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < 40) {

                    passed = false;
                    break;
                }
            }

            if (passed) {

                passingStudents++;
            }
        }

        System.out.println(
                "Passing students = " + passingStudents
        );


        // ------------------------------------------------
        // 8. CLASS TOTAL AND CLASS AVERAGE
        // ------------------------------------------------

        int classTotal = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                classTotal = classTotal + arr[i][j];
            }
        }

        int totalMarks = arr.length * arr[0].length;

        double classAverage =
                (double) classTotal / totalMarks;

        System.out.println(
                "Class Total = " + classTotal
        );

        System.out.println(
                "Class Average = " + classAverage
        );


        // ------------------------------------------------
        // 9. STUDENTS ABOVE CLASS AVERAGE
        // ------------------------------------------------

        int aboveClassAverage = 0;

        System.out.println(
                "\nStudents above class average:"
        );

        for (int i = 0; i < arr.length; i++) {

            int studentTotal = 0;

            for (int j = 0; j < arr[i].length; j++) {

                studentTotal = studentTotal + arr[i][j];
            }

            double studentAverage =
                    (double) studentTotal / arr[i].length;

            if (studentAverage > classAverage) {

                System.out.println(
                        "Student " + (i + 1) +
                                " → Average = " + studentAverage
                );

                aboveClassAverage++;
            }
        }

        System.out.println(
                "Students above class average = "
                        + aboveClassAverage
        );


        sc.close();
    }
}
