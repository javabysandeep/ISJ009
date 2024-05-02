package controlStatements.looping.whileDemos;

public class Demo6 {
    public static void main(String[] args) {
        int number = 246123;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("sum of digits " + sum);
    }
}
