//Question --> MATRIX ANALYZER
// using of 3*3 matrix and to find the diagonal sum of the given matriox
//Taking matrix input also

import java.util.Scanner;

public class MatrixAnalyzerprob1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //making matrix of 3*3
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            //for j loop
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Provide value for row= " + i + " and column=" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + "  ");
            }
            System.out.println();
        }






    }
}
