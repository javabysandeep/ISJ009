package controlStatements;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the byte value");
        byte byteValue = scanner.nextByte();

        System.out.println("Enter the short value");
        short shortValue = scanner.nextShort();


        System.out.println("Enter the int value");
        int intValue = scanner.nextInt();

        System.out.println("Enter the long value");
        long longValue = scanner.nextLong();


        System.out.println("Enter the float value");
        float floatValue = scanner.nextFloat();


        System.out.println("Enter the double value");
        double doubleValue = scanner.nextDouble();


        System.out.println("Enter the boolean value");
        boolean booleanValue = scanner.nextBoolean();


        System.out.println("Enter the char value");
        char charValue = scanner.next().charAt(0);

        System.out.println("Enter the String value");
        String stringValue = scanner.next();

        System.out.println("you have entered values");

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(charValue);
        System.out.println(stringValue);

    }
}
