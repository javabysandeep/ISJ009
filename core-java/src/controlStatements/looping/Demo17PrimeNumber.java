package controlStatements.looping;

public class Demo17PrimeNumber {
    public static void main(String[] args) {
        int number = 14;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Its prime number" : "not a prime");
    }
}
