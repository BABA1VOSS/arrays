import java.util.Scanner;
import java.util.Random;
//Question from Aman rout
public class questionsFromChatGptPart2 {
    static void main(String[] args) {
//        // For storing username and Password
//        // I am Storing a variable
//        Scanner sc = new Scanner(System.in);
//
//        //Storing credentials
//        System.out.println("please login to this Page ");
//        String registeredUsername = "Akj6776";
//        String registeredPassword = "321jha";
//
//        //taking input from user
//        System.out.print("Enter your username:-");
//        String username = sc.nextLine();
//
//        System.out.print("Enter your password:-");
//        String password = sc.nextLine();
//
//        //checking that user gives correct credentials or not
//        if (username.equals(registeredUsername) && password.equals(registeredPassword)){
//
//            System.out.println("Credentials Matched");
//            System.out.println("Password Matched");
//            System.out.println("Moving you to the next page");
//
//        } else {
//            System.out.println("Invalid username or password");
//        }
//        System.out.println("Enter the OTP sent to your connected mobile number");
//        Random random = new Random();
//        int otp;
//        otp = random.nextInt();
//
//
//        sc.close();

        //YEH SAB MERI THINKING THI JO KI FAIL RAHI LEKIN AB MEIN REAL ANSWER CODE LIKHNE JA RHA HU JISSE MEREKO SAB SAMJH AAJAYE MERKEO SMJH TO AAGYA LEKIN ANSWER DEKH KE KHUD SE MEIN ATTEMPT HI NAHI KAR PAYA


  Scanner sc = new Scanner(System.in);
  Random random = new Random();

  //Stored credentials
        String registeredUsername = "Akj6776";
        String registeredPassword = "321jha";

        //Attempt counter
        int attempt = 0;
        boolean loginSuccessful = false;

        //login loop --> while loop chalayenge matlab jisme ki hume yeh dekhna hai ki jab tak attempt 3<3 ki condition ko false ni detect karta loop chalta rahega
        while (attempt < 3){
            System.out.print("Enter your Username:-");
            String username= sc.nextLine();

            System.out.print("Enter your password:-");
            String password= sc.nextLine();

            // ab yaha se if condition chalu kar dunga mein ki jab tak yeh dono condition true nahi hoti tab tak attempt karo lekin maximum 3 attempt hai
            if (username.equals(registeredUsername)  && password.equals(registeredPassword)){
                System.out.println("Credential matched");
                loginSuccessful  = true;
                break;   // condition break kar di fir yeh loop se bahar chale jayega or kuch nahi uthayega.
            }
            else {
                System.out.println("Incorrect Username and Password");
                attempt ++;
                System.out.println("Attempts left for you :- " + (3-attempt));
            }
        }
      if(!loginSuccessful){
          System.out.println("Account is locked");
          sc.close();
          return;
      }
      //Generating OTP
      int otp =  10000000 + random.nextInt(90000000);
        System.out.println("Otp is send to your mobile no. " + otp);

        //Take input of otp from user
        System.out.println("Enter the OTP");
        int enteredOTP= sc.nextInt();

        //verify the otp
        if (enteredOTP==otp) {
            System.out.println("otp verification succesfully");
            System.out.println("Login into system ");

            //menu banaya hai
            System.out.println("\n----- MENU -----");
            System.out.println("1. View Profile");
            System.out.println("2. Change Password");
            System.out.println("3. Logout");

            System.out.println("Enter your choice");
            int givenchoice = sc.nextInt();
            sc.nextLine();

            switch (givenchoice) {
                case 1:
                    System.out.println("openening profile.....");
                    break;

                case 2:
                    System.out.println("change your password");
                    System.out.println("Enter your new password");
                    String newpassword = sc.nextLine();
                    break;
                case 3:
                    System.out.println("tap the logout button to logout");
                    break;

                default:
                    System.out.println("invalid choice");

            }
        }else {

            System.out.println("Invalid OTP!");
            System.out.println("Login failed.");
        }
        sc.close();













    }



}
