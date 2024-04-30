package controlStatements.conditional;

import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        // accept the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("Five");
            default -> System.out.println("invalid number");
        }
    }
}
