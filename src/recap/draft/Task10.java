package recap.draft;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("What operation do you want to do? Add/remove/view/search/done");
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[3];

        String command = scanner.next();

        if (command.equalsIgnoreCase("add")) {
            for (int counter = 0; counter < items.length; counter++) {
                System.out.println("What item you want to add?");
                items[counter] = scanner.next();
                System.out.println("You added: "+items[counter]);
            }
            System.out.println("Strings Entered by user:");
            for (String newItem : items) {
                System.out.print(newItem + " ");
            }
        }
    }
}









