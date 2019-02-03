package recap.task3;

import java.util.Scanner;
//done
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Hello, user, please enter your full name");
        Scanner scanner = new Scanner(System.in);
        String fullname = scanner.nextLine();
        String replace = fullname.replaceAll(".(?=.)", "$0 ");
        System.out.println(replace);

        System.out.println("Welcome stranger. Please Enter String");
        String input = scanner.nextLine();

        char[] charArrays = input.toCharArray();
        for(int counter=0;counter<charArrays.length;counter++){
            System.out.print(charArrays[counter]+" ");
        }
    }
}
