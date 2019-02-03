package recap.task7;

import java.util.Scanner;

public class task7byMurat {
    public static void main(String[] args) {
        System.out.println("Welcome stranger.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the sentence. If you are done write Done.");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Which order for the sentence you want to print");
                String numberOfWord = scanner.nextLine();
                /**int option = input.nextInt();
                 * input.nextLine();  // Consume newline left-over
                 */
                if (Integer.parseInt(numberOfWord) <= 0) {
                    System.out.println("Cannot accept 0 or negative number");
                } else {
                    String[] splittedWords = input.split(" ");

                    int counter = 1;
                    boolean found = false;

                    for (String word : splittedWords) {
                        if (!word.isEmpty() && !word.equalsIgnoreCase(" ")) {
                            if (counter == Integer.parseInt(numberOfWord)) {
                                System.out.println("Result Word: " + word);
                                found = true;
                                break;
                            } else {
                                counter++;
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("We cannot find the word. Sentence is too short.");
                    }

                }

            }
        }
    }
}
