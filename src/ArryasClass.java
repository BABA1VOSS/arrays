import java.util.Scanner;

public class ArryasClass {
    static void main() {
        int arr[]= {3,2,-5,21,10};
        int n = arr.length;
        int minValue=arr[0];


//        comparing max value with each element of array
        for (int i=0; i<=n-1; i++){
          if (arr[i]< minValue){
//              update
        minValue = arr[i];
          }
        }
        System.out.println(minValue);







//        int arr[]={2,3,10,20};
//          int n = arr.length;
//          int ans = 1;
//          for (int i=0; i<=n-1; i++){
//              int value=arr[i];
//              ans= ans * value;
//
//        System.out.println(ans);




        //        int n = arr.length;
//        int sum =0;
//        for (int i=0; i<=n-1; i++){
//            int value=arr[i];
//          sum=sum + value;
//        }
//        System.out.println(sum);



//        int arr[]= {12,14,11};
//        System.out.print(arr[1]);//index value denge to print ho jayega
//        isse answer print nahi hua isliye for loop ka use kar rhe hai
//        int n = arr.length;
//        for (int i=0; i<=n-1; i++){
//            System.out.println(arr[i]);
//        }



//        int arr[]= new int[10];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for (int i=0; i<=n-1; i++){
//            System.out.println("provide your index value at " + i + " : ");
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("your array is ");
//        //print
//        for (int val: arr){
//            System.out.println(val);
//        }











        //declaration
//        int arr[];
        //allocation
//        arr = new int[2];
        //Init
//        int brr[]= {10,20,309};

//        using through loops --------->>
//        int n= brr.length;
//        for (int val: brr){
//            System.out.println(val);
//        }
//        System.out.println(n);
//        for (int index = 0; index<=n-1; index++)
//            System.out.println(brr[index]);

//        System.out.println("value at 0 index: " + brr[0]);
//        System.out.println("value at 1 index: " + brr[1]);
//        System.out.println("value at 2 index: " + brr[2]);





    }
}
