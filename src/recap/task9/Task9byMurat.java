package recap.task9;

import java.util.Scanner;

public class Task9byMurat {
    public static void main(String[] args) {
        System.out.println("Welcome stranger.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write String");
        String sentence = scanner.nextLine();
        System.out.println("Write the char to search in the string");
        Character selectedChar = scanner.nextLine().charAt(0);

        int totalAmount = 0;
        char[] totalChars = sentence.toCharArray();
        for (char incomingChar : totalChars) {
            if (incomingChar == selectedChar) {
                totalAmount++;
            }

        }
        System.out.println("Result:" + totalAmount);

    }
}
