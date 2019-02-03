package recap.task2;

import java.util.Scanner;
//ONE
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Please enter number 1");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        System.out.println("Welcome stranger. Please enter number 2");
        int userInput2 = scanner.nextInt();

        if(userInput1>userInput2){
            System.out.println("You entered 2 numbers: " + userInput1+ "-" + userInput2 + "." + "Bigger number: " + userInput1);
        } else if( userInput1<userInput2){
            System.out.println("You entered 2 numbers: " + userInput1+"-" + userInput2 + "." + "Bigger number: " + userInput2);
        }else{
            System.out.println("You entered 2 numbers: " + userInput1+ "-" + userInput2 + ". They are the same");
        }

    }
}
