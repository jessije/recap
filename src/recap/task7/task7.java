package recap.task7;
//done
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Write a sentence. If you are done, write DONE");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            System.out.println("Please enter the order of the sentence. If you are done, write DONE");
            String[] words = input.split("\\s+");
            int wordOrder = scanner.nextInt();
            if (wordOrder <= 0) {
                System.out.println("cannot accept negative number or 0");
                continue;
            } else if ((wordOrder - 1 > words.length)) {
                System.out.println("sentence does not have this much of words.");
                continue;
            }
            if ((wordOrder - 1 < words.length)) {
                System.out.println(words[wordOrder - 1]);
            }
        }
    }
}



