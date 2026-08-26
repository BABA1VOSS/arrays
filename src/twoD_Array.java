import java.util.Scanner;

public class twoD_Array {
    static void main() {

        int arr[][]= { {1,2,3,} ,{21,20,19} };
        int minValue= arr[0][0];

        for (int i=0; i>arr.length; i++){
            for (int j=0; j>arr[i].length; j++){
                if (arr[i][j] > minValue){
                    //update value
                    minValue=arr[i][j];
                }
            }
        }
        System.out.println(minValue);







//        int ans = 1;
//
//        for (int i =0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                int value = arr[i][j];
//                ans = ans*value;
//            }
//        }
//        System.out.println("multiplication is " + ans);
//        for (int i = 0; i<arr.length; i++){
//            for (int j = 0; j<arr[i].length; j++){
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//        }
//        System.out.println(sum);



//        int arr[][]= new int[3][4];
//     Scanner sc = new Scanner(System.in);
//     //input
//        for (int i = 0; i<=arr.length-1; i++){//or we can use i<= length-1 and i< length
//            for (int j=0; j<=arr[i].length-1; j++ ){
//                System.out.println("Provide value for row= " + i + " and column=" + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        //print
//        for (int rowIndex=0; rowIndex<=arr.length-1; rowIndex++){
//            for (int colIndex=0; colIndex<=arr[rowIndex].length-1; colIndex++){
//                System.out.print(arr[rowIndex][colIndex] + "  ");
//            }
//            System.out.println();
//        }

// dec
//        int[][]arr;
//        allocation/
//        arr = new int[2][3];
//        init
//        int[][]brr= {
//                {1,2,5,7,23,64,2},
//                {2,3,4,6},
//                {3,4,2,5,3},
//                {4,5,3},
//                {5,6},
//                {7}
//        };
//        //System.out.println(brr[3][0]);
//    aise format ko print karvane ke lie nested loop ka use karenge
//
//        int rowLength = brr.length;
//       int colLength =  brr[0].length;//yeh tabhi use karenge jab humre pas same row and columns avialable ho
//
//        /*
//        ab dekho jaise pehle balanced array thi to humne isko solve kia uper.. ab unblanaced array hai to usko solve karne ke lie hum har row pe jaise hi jayenge wese hi har column par bhi jayenge jiske lie fir hum yeh cheez karenge rowlegth ke index.length
//         */
//         for (int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
//             int colLength = brr[rowIndex].length;
//             for (int colIndex=0; colIndex<=colLength-1; colIndex++){
//                 System.out.print(brr[rowIndex][colIndex] + " ");
//             }
//             System.out.println();
//        }


        //traversal of 2d array
//        for (int rowIndex = 0;  rowIndex<=brr.length-1; rowIndex++){
//            for (int colIndex = 0; colIndex<=brr[rowIndex].length-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }










    }
}
