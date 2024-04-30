package controlStatements.looping;

public class Demo16 {
    public static void main(String[] args) {
        // 28 --> 1, 2, 4, 7, 14
        //6 --> 1, 2, 3
        //perfect number : sumOfFactors = given number
        int sumOfFactors = 0;
        int number = 6;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor " + i);
                sumOfFactors = sumOfFactors + i;
            }
        }
        System.out.println(
                number == sumOfFactors
                        ? "Perfect" : "Not a perfect");
    }
}
