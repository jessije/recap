package recap.task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = {"", "", "", "", ""};
        int totalAmountOfItems = 0;
        Task11Util task11Util = new Task11Util();


        while (true) {
            System.out.println("What operation do you want to do? Add/remove/view/search/done");
            String command = scanner.nextLine();
            if (!command.equalsIgnoreCase("add") && !command.equalsIgnoreCase("view") &&
                    !command.equalsIgnoreCase("remove") && !command.equalsIgnoreCase("search") &&
                    !command.equalsIgnoreCase("done")) {
                System.out.println("wrong command");
                continue;
            }
            if (command.equalsIgnoreCase("add")) {
                System.out.println("What item you want to add?");
                String itemAdded = scanner.nextLine();
                items = task11Util.add(itemAdded,items);
            }
            else if (command.equalsIgnoreCase("view")) {
                task11Util.view(items);

            }
            else if (command.equalsIgnoreCase("search")) {
                System.out.println("What item do you want to search?");
                String searchItem = scanner.nextLine();
                task11Util.search(searchItem,items);

            }
            else if (command.equalsIgnoreCase("remove")) {
                System.out.println("What item do you want to remove?");
                String deletedItem = scanner.nextLine();
                items = task11Util.remove(deletedItem,items);

            }

        }

    }
}
