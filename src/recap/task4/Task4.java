package recap.task4;

import java.util.Scanner;
//done
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Welcome, Stranger. Please enter the password");
        Scanner scan = new Scanner(System.in);
        String input1 = scan.next();

       String pass = "Password";
       if(input1.equalsIgnoreCase(pass)){
           System.out.println("First password is correct. Please enter the second password");
           String input2 = scan.next();
           String pass2 = "Password1";
           if(input2.equalsIgnoreCase(pass2)){
               System.out.println("Welcome to the club");
           }else{
               System.out.println("Second password is wrong");
           }
       }else{
           System.out.println("First password is wrong");
       }
    }
}
