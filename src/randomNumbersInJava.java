//for random numbers we have to import random class like Scanner class
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
//import java.util.Scanner;
public class randomNumbersInJava {
    static void main() {


        Random random = new Random();
//           int number;
//
//         number = random.nextInt();
//        System.out.println(number);
//        it displays number from -ve 2 billion  to       +ve 2 billion.



//        int number;

//        number = random.nextInt(1,6);
        //left one from starting bracket is inclusive matalb hum wo number consider karenge and from right side of baracket is exclusive means hum usko consider nahi karenge
//        System.out.println(number);

//
//        double number;
//        number = random.nextDouble();
//        //it displays number from 0 to 1
//        System.out.println(number);

        //In boolean case which returns true or false
//        boolean isHeads;
//        isHeads = random.nextBoolean();
//        System.out.println(isHeads);


        //Using of If-Else case in this
        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads){
            System.out.println("HEADS");

        }else {
            System.out.println("TAILS");
        }
//        System.out.println(isHeads);

    }
}
