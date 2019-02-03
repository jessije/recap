package recap.task1;

import java.util.Scanner;
//DONE
public class Task1 {
    public static void main(String[] args) {
        /*System.out.println("Hello, user, please enter your full name");
        Scanner scanner = new Scanner(System.in);
        String[] fullname = new String[2];
        String name, surname;
        fullname = scanner.nextLine().split(" ");
        name = fullname[0];
        surname = fullname[1];

        if (!name.equals("James") && !surname.equals("Bond")) {
            System.out.println("You are not an agent. Get out, " + name + " " + surname);

        } else {
            System.out.println("Welcome 007");
        }
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, user, please enter your full name");
        String fullname1 = scanner.nextLine();
        if (fullname1.equalsIgnoreCase("James Bond")) {
            System.out.println("Welcome 007");
        } else {
            System.out.println("You are not an agent. Get out, " + fullname1);
        }

    }
}
