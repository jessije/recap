package recap.task5;

import java.util.Scanner;
//done
public class Task5 {
    public static void main(String[] args) {
        System.out.println(" Please enter number for factorial. -1 is special command to exit");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            else if (number < 0) {
                System.out.println("Negative number not accessible");
                continue;
            }else if(number == 0) {
                System.out.println("result is 1");
                System.exit(1);

            }
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("result is " + factorial);
        }

    }
}
