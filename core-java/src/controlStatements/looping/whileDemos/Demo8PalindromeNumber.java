package controlStatements.looping.whileDemos;

public class Demo8PalindromeNumber {
    public static void main(String[] args) {
        int number = 151;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse Number " + reverse);
        System.out.println(number==reverse?"Palindrome":"Not a palindrome");
    }
}
