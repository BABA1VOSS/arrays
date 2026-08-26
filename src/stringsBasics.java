import javax.management.monitor.StringMonitor;
import java.util.Locale;
import java.util.Scanner;

public class stringsBasics {
    //solution for question no.2;
//    static int getLengthOfString(String str){
//        int count = 0;
//        for (char ch: str){  // for each loop string ke uper nahi chalta hai string par hume yeh apply nahi karna hai
//            count++;
//
//        }
//    }
//    solution of question no -->2
//        char[] arr = str.toCharArray();
//               int len=arr.length;
//               return len;
//            }

            //question no --> 3 cont a vowels in a string
    //solution of question no --> 3
    static int getVowelsCount(String str){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        return count;
    }
//

//    question no--> 4 reverse a given string
    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for (int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse= reverse + ch;
        }
        return reverse;
    }
//


//    question no --> 5 check sring is palindrome or not
    static boolean isPalindrome(String str) {
        String original= str;
        String reverse = reverseString(original);//yeh question 4 mein reverse kar ke kuch hai tabi error ni aarha hai warna to error aarha tha aur uska solution tha
//        String reverse = new StringBuilder(original).reverse().toString();      yeh jo solution hai isme StringBuilder allow karta hai String ko reverse karne ka kyunki String immutable hai to hum usko direct change nahi kar skte hai , StringBuilder java ki hi ek property hai jisse yeh kaam chal rha hai ...
        for (int i=0; i<original.length(); i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
                if (ch1 != ch2) {
                    //no match
                    return false;
                }
            }

//mein loop se Bahar table aunga jab sare character match ho rhe honge
        //iska Matlab return true ;
        return true;

    }



//solution for question no.1
//    static void PrintString(String str){
//        int n = str.length();
//        for (inti =0; i<n; i++){
//            char ch = str.charAt(i);
//            System.out.println(ch);
//        }
//    }
    static void main() {
//        String str = "Hello guys how are you let's find how many vowels are there in this string";
        String str = "Love";
        System.out.println(isPalindrome(str));
        }
//        question no.1 -> JPrint each character of the String
        //solution static void main ke uper se chalu hoga method or function ke jariye karenge isko isliye
//          String str = "Love";
//        PrintString(str);
//


        // question-->2 count length of string without using length() function.





































//        .replace(charoldchar,chariness)
//           String name = "baba";
//           name = name.replace('b','l');
//        System.out.println(name);





// split ke under -> output -> string array 9string ka array dedia )
//         String input = "My,name,is,Aryan";
//         String[] words = input.split(",");
//         for (String str: words) {
//             System.out.println(str);
//         }

//        String name = "Aryan";
//        char[] crr=name.toCharArray();
//
//        for(char ch: crr){
//            System.out.println("value of char: " + ch);
//        }



//        String line = "I love my friends";
//        System.out.println(line.startsWith("I"));
//        System.out.println(line.endsWith("friend"));

//        int num = 51234;
//        String str = String.valueOf(num);
//        System.out.println(num + 1);
//        System.out.println(str + 1);//string mein addition ni hot concatenate hot hai


        //empty --> length  = 0
        //blank  --> empty or  sirf spaces h string
//        String str = "  ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        String str2 = "Aryan  ";
//        System.out.println(str2.length());
//        str2 = str2.trim();
//        System.out.println(str2.length());

//           String name = "My name is Aryan";
           //0 -> M
           //1 -> y
           //2 -> space and so on
           // beginIndex -> 3 is inclusive means starting
           //endIndex -> 9 is exclusive means ending
//        System.out.println(name.substring(3,9));
//        System.out.println(name.contains("Ary"));





//        String str = "Aryan";
//        System.out.println(str.length());
//        System.out.println(str.charAt(4));
//        String name = "ARYAN";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));


//        Scanner sc= new Scanner(System.in);
//        System.out.println("Provide the string content");
//        String str = sc.nextLine();
//        System.out.println("value of nextLine : " + str);
//
//        System.out.println("Provide the string content");
//        String str2 = sc.next();
//        System.out.println("value of next: " + str2);


//        String name1= "Love";
//       String name2 = "LoVe";
//
//       if (name1.equalsIgnoreCase(name2)){
//           System.out.println("Both strings are equal");
//       }
//       else {
//           System.out.println("Both Strings are not equal");
//       }
       //== yeh sirf Sahi batata hai ki yeh dono addresses same hai to TRUE dega only compares references , yeh content compare nahi karta kabi !












//        String name = "Babar";
//        name = "Bana";
//        System.out.println(name);

//        String firstName = "Love";
//        String lastName = new String("Babar");
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.length() + lastName.length());
//        System.out.println(lastName.charAt(5));
    }

