import java.util.Scanner;

public class basicMathsReverseANumber {
    static int reverseNum(int num){
      int revNum = 0;
      //ans = ans*10 + digit


        while(num != 0){
           int digit = num % 10;
           //formula apply karunga mein ab isme
            revNum= revNum*10 + digit;
            // ab mein isme number hataunga jo ue kar lia
            num = num/10;
        }
        return revNum;
    }

    static boolean isPalindrome (int num){
        int originalNum = num;
        int reversedNum = reverseNum(num);
        if (originalNum == reversedNum){
            System.out.println("It is a palindrome");
            return true;
        }
        else {
            System.out.println("Not a palindrome");
            return false;
        }

    }
  // Faster method of checking whether a given no. is a prime numeber or not !
      static boolean isPrimeOrNot(int num) {
        for (int i =2; i*i<=num; i++){
            if (num % i == 0) {
                return false;
            }
        }


//          for (int i = 2; i <= num - 1; i++) {
//      if (num % i == 0) {
//        return false;
//    }
//}

          //yaha tak pahunch paoge jab , jab loop se baahar aoge
          /*
          or loop se tabhi bahar nikloge jab kabhi bhi remainder mein zero na aye
          or kabhi reamainder mein zero na aye iska mtlb number is a prime number
           */
          return true;
      }


      //Finding gcd  of a numbers
    static int getGCD(int a , int b) {
        //get(a,b) = gcd(b,a%b)
        while(b !=0){
        int oldvalueofb = b;
        b = a % b;
        a = oldvalueofb;
        }
        int ans = a;
        return ans;
    }

    static int getLCM(int a, int b){
        int GCD = getGCD(a,b);
        int prod = a*b;
        int Lcm = prod/GCD;
        return Lcm;
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int originalNumber = num;
        while (num !=0){
            //to extract the digit
            int digit = num%10;
            //iska cube karenge
            int cubeOfDigit = digit * digit * digit;
            //ab us cube ka sum karenge
            sum = sum+cubeOfDigit;
           num = num/10;
        }
        if (sum == originalNumber){
            return true;
        }
        else {
            return false;
        }
    }

    // perfect number
    static boolean togetPerfectNumber(int num){
        int sum = 1;
        for (int i=2; i*i<=num; i++){
            if (num % i == 0){
                //i num ko perfectly divide kar dia hai to ab pair kya banange
                //1st factor to i hi ban jayega
                //2nd factor fir -> num/i ban jayega
                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum + firstFactor + secondFactor;
            }
        }
            if (sum == num){
                return true;
            }
            else {
                return false;
            }
    }


    static void printAllPrimeNumbers (int n){
        for (int num=2; num<=n; num++){
            boolean isPrime = isPrimeOrNot(num);
            if (isPrime == true){
                System.out.println(num);
            }
        }
//        return true;// agar mein neeche variable issue karta hu tabhi yeh true ayega likha hua warna nahi ayega direct print karvane par or agar mein boolean likhta hu void ki jagah tab kuch return karvane ki jaruat padti hai wese nahi
    }
    //Even and odd number checking
//    static void toCheckEvenAndOdd() {
//        int n = 7;
//        if (n % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("odd");
//        }
//    }
    static boolean toCheckEvenAndOdd(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }



    static int powerOfANumber(int base, int exponent ){
        int result =1;
        for (int i=1; i<=exponent; i++){
               result = result * base;
        }
        return result;
    }

    static int findFactorial(int num){
        int fact = 1;
//        int num=6;
        for (int i=1; i<=num; i++){
            fact = fact * i;
            System.out.println(fact);
        }
        System.out.print("The Total value of factorial is ");
        return fact;
    }

    static int countEvenDigitInAGivenNumber(int num){
//        int sum = 0;
        int count = 0;
        //pehle number extract karunga
        //extraction ke bad check karunga agar to divisible by 2 hai
        //to usko consider karo warna dhyaan hi mat do
        //fir us number ko mein remove kar dunga or yahi cheez chalti rahegi
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2==0){
                count++;
            }
            num = num/10;
        }
              return count;
    }
    static void main() {
        System.out.println(countEvenDigitInAGivenNumber(46826));
//        int base = 2;
//        int exponent = 5;
//        System.out.println(base + "^" + exponent + "is" + powerOfANumber(base,exponent));
//        System.out.println(findFactorial(200));

//        System.out.println(toCheckEvenAndOdd(9));
//        printAllPrimeNumbers(1000);
//        boolean ans = printAllPrimeNumbers(23);
//        System.out.println(ans);
//        System.out.println(printAllPrimeNumbers(23));

//        System.out.println(togetPerfectNumber(6));
//        boolean ans=togetPerfectNumber(8128);
//        System.out.println(ans);




//        boolean ans = isPrimeOrNot(23);
//        System.out.println(ans);
//        int revNum = reverseNum(num);
//        System.out.println(revNum);

//        square of a number

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int mulitply = num*num;
//        System.out.println("The square of a number is : " + mulitply);
//        sc.close();







    }
}

