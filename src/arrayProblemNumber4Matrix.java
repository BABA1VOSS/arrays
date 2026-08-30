// creating of a 2d array
// 3 students and each has marks in 4 subjects
//Take all marks from the user
//calculate the total marks of each students
//Find the highest marks in the entire matrix
//Find the lowest marks in the entire matrix
//isme yeh catch hia ki ek aur tareeka hai print karvane ka lekin usko use nahi kar skta mein tareeeka yeh hai ki Arrays.deepToString()

import java.util.Scanner;
public class arrayProblemNumber4Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating of a 2d array
        int arr[][] = new int[3][4];
        //using of for loops for both the inner and outer loop or we also known as i and j
        //for i loop
        for (int i = 0; i <= arr.length - 1; i++) {
            //for j loop
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Provide value for row= " + i + " and column=" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        //Hume isko alag se hi print karvana padega issi mein karenge values bar bar print hoti rehti hai or itna hi ni agar ek loop ko lete hai to fir usme ek ko detect ni karta hai
        //print //printing ke lie alag se method dalna padta hai iska jaise ki abhi mene kia hai isme bhi alag rows and columns ke lie alag for loops ka use hota hai
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + "  ");
            }
            System.out.println();
        }
        //calculate the total marks of  each student
        int sum = 0;
        //maximum har1
        // cheez ke lie 2D array mein loop hi chalta hai
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                int value = arr[i][j];
                sum = sum + value;//i can eventually write sum = sum + arr[i][j]
            }
        }
        System.out.println("Total Sum of all the marks " +sum);
        for (int i = 0; i< arr.length; i++){
            int sum1=0;
            for (int j = 0; j<arr[i].length; j++){
                sum1 =sum1 +  arr[i][j];
            }
            System.out.println("student " + (i+1) + "total " + sum1);
        }
//        System.out.println("The sum of each student are " + sum1);

//        to calculate the highest marks
        int max;
        int min;
        max = arr[0][0];
        min = arr[0][0];
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The max marks is :-" + max);


        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The minimum marks is :-" + min);





    }
}
