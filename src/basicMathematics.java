public class basicMathematics {
   static void printDigits(int num){
       //jab mera number = 0 aajayega to mein ruk jaunga
       //or jab tak not equal to != 0 ayega mein chalta rahunga
       while(num != 0){
           int digit = num % 10;
           System.out.println(digit);
           //last number remove
           num = num / 10;
       }
   }
    static int countDigit(int num){
        //jab mera number = 0 aajayega to mein ruk jaunga
        //or jab tak not equal to != 0 ayega mein chalta rahunga
        int count = 0;
        while(num != 0){
            int digit = num % 10;
            count++;
            //last number remove
            num = num / 10;
        }
        return count;
    }


    static int sumOfDigitsOfANumber(int num){
    //jab mera number = 0 aajayega to mein ruk jaunga
    //or jab tak not equal to != 0 ayega mein chalta rahunga
    int sum = 0;
        while(num != 0){
        int digit = num % 10;
        sum = sum + digit;
        //last number remove
        num = num / 10;
    }
        return sum;
}



    static void main() {
      int num = 53421;
      int sum = sumOfDigitsOfANumber(num);
        System.out.println(sum);
    }
}
