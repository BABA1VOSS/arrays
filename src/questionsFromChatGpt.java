import java.util.Scanner;
public class questionsFromChatGpt {
    static void main() {
        System.out.println("Students name is :- Aryan kumar jha");
        System.out.println("Roll number is :- 17");
         String subj1= "Maths";
         int marks1 = 89;
        String subj2= "IT";
        int marks2= 96;
        String subj3= "computer";
        int marks3 = 82;
        System.out.println("Subjects are:- ");
        System.out.println(subj1 + "  " + subj2 +"  "  +"  " + subj3);
        int totalMarks= marks1+ marks2 + marks3;
        System.out.println(totalMarks);
        double percentage = (totalMarks/300.0) * 100.0;
//        percentage = percentage/300 * 100;
        System.out.println(percentage + "%");
        //printing of highest marks in the given subjects


        //CHECKING OF HIGHEST MARKS
//        int highest = marks1;
//        if (marks2>highest){
//            highest=marks2;
//        }
//        if (marks3 > highest){
//            highest = marks3;
//        }
//        System.out.println(highest);
        if (marks1 >= marks2 && marks1>=marks3){
            System.out.println(subj1 + " marks is " + marks1);
        } else if (marks2>=marks1  && marks2>=marks3){
            System.out.println(subj2 + " marks is " + marks2);
        } else if (marks3 >= marks1  && marks3>=marks2) {
            System.out.println(subj3 + " marks is " + marks3);
        }
        //determininig the student is pass or fail
        //for this i use if or else
        if (marks1 >= 33){
            System.out.println("passed in " + subj1 );
        }
        else {
            System.out.println("Fail");
        }
        if (marks2 >= 33){
            System.out.println("passed in " + subj2);
        }
        else {
            System.out.println("Fail");
        }
        if (marks3 >= 33){
            System.out.println("passed in " + subj3);
        }
        else {
            System.out.println("Fail");
        }
       //use of ternary operator acts as a mini if else operator
        // Using a short inline check for each subject (passing criteria >= 33)
//        System.out.println(subj1 + " (" + marks1 + "): " + (marks1 >= 33 ? "Passed" : "Failed"));
//        System.out.println(subj2 + " (" + marks2 + "): " + (marks2 >= 33 ? "Passed" : "Failed"));
//        System.out.println(subj3 + " (" + marks3 + "): " + (marks3 >= 33 ? "Passed" : "Failed"));

        // also another method to check pass or fail is
        // Check pass/fail
//        boolean passed = marks1 >= 33 && marks2 >= 33 && marks3 >= 33;
//        System.out.println(passed);



        //DETERMINING THE GRADE
        // Example using marks1 (89)
        char grade;

        if (marks1 >= 90) {
            grade = 'A';
        } else if (marks1 >= 75) {
            grade = 'B';
        } else if (marks1 >= 60) {
            grade = 'C';
        } else if (marks1 >= 33) {
            grade = 'D';
        } else {
            grade = 'F'; // Failed
        }

        char grade2;

        if (marks2 >= 90) {
            grade2 = 'A';
        } else if (marks2 >= 75) {
            grade2 = 'B';
        } else if (marks2 >= 60) {
            grade2 = 'C';
        } else if (marks2 >= 33) {
            grade2 = 'D';
        } else {
            grade2 = 'F'; // Failed
        }
        char grade3;
        if (marks3 >= 90) {
            grade3 = 'A';
        } else if (marks3 >= 75) {
            grade3 = 'B';
        } else if (marks3 >= 60) {
            grade3 = 'C';
        } else if (marks3 >= 33) {
            grade3 = 'D';
        } else {
            grade3 = 'F'; // Failed
        }


        System.out.println(subj1 + " Grade: " + grade);
        System.out.println(subj2 + " Grade: " + grade2);
        System.out.println(subj3 + " Grade: " + grade3);


    }

}

