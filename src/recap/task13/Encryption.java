package recap.task13;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        System.out.println("Hello, stranger");
        System.out.println("Which word you want to encrypt");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        firstInput="(?i)" + firstInput;
        System.out.println("which word you want to change to");
        String secondInput =scanner.nextLine();
        System.out.println("what is the sentence?");
        String sentence = scanner.nextLine();

        String result = sentence.replace(firstInput, secondInput);
        System.out.println(sentence);
        System.out.println(result);
    }
}
