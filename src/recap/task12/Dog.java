package recap.task12;

import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        System.out.println("welcome, stranger");
        System.out.println("Enter your dog's name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Enter your dog's age");
        int age = scanner.nextInt();
        while (age < 0) {
            System.out.println("Age cannot be negative");
            System.out.println("Enter your dog's age");
            age = scanner.nextInt();
        }

        System.out.println("Enter your dog's species");
        String species = scanner.next();
        while(!species.equalsIgnoreCase("husky")&&!species.equalsIgnoreCase("beagle")&&
                !species.equalsIgnoreCase("chihuahua")) {
            System.out.println("It is not chihuahua or husky or beagle...");
            System.out.println("Enter your dog's species");
            species = scanner.next();
        }
            DogMethod dog2 = new DogMethod(name, species, age);
            dog2.printData();
            if (species.equalsIgnoreCase("beagle")) {

                dog2.beagleAge(age);
            } else if (species.equalsIgnoreCase("husky")) {

                dog2.huskyAge(age);
            } else if (species.equalsIgnoreCase("chihuahua")) {

                dog2.chihAge(age);
            }
        }
    }










