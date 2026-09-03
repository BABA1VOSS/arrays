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
                avg = (double)sum / 4;
            }
            System.out.println("Students " + (i +1) + " marks " + sum);
            System.out.println("Students " + (i+1) + " avg "+ avg);
        }
        //calculating each Students avg
        // same trick to be applied because i is students and j is marks , avg is applied on marks
        //continuing the loops again

       //M avg bhi uper hi calculate kar deta hu fir to kyunki marks ke sum ki jarurat to mujhe padegi hi fir se.. baakli iski alternate technique dhundh leta hu ki is loop ka samaan bahr uss loop mein kaise use karu ----> bhai aisi koi trick nahi hai , Scope ke bahar nikle bina purane variables ko zinda rakhne ka koi shortcut nahi hai, Java mein aisi koi trick nahi hai. Java ke Block Scope rules bohot strict hote hain, aur iska seedha sa rule hai: jo variable jis curly braces {} ke andar declare hota hai, uski zindagi wahi shuru aur wahi khatam hoti hai.


        // finding of highest individual marks








    }

}
