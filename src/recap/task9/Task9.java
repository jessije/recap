package recap.task9;

import java.util.Scanner;
//DONE
public class Task9 {
    public static void main(String[] args) {
        System.out.println("Please enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Write the char to search in the string");
        char character = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Result is: " + count);
    }
}
