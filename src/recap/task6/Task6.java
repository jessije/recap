package recap.task6;

import java.util.Scanner;
//done

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Write a sentence. If you are done, write DONE");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            } else {
                int index = input.indexOf(" ");
                String fistString = input.substring(0, index);
                System.out.println(fistString);
                System.out.println("Write a sentence. If you are done, write DONE");
            }
        }
    }
}