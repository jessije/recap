package recap.task14;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print number");
        String input = scanner.nextLine();
        while(true)
        if(input.matches("[.0-9]+")){
            System.out.println("Correct. This is a number");
            break;
        }else{
            System.out.println("It is NOT a number");
            break;
        }
    }
}
