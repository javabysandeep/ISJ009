package controlStatements.looping.forDemos;

public class Demo23Pattern6 {
    public static void main(String[] args) {
        /*

            1
            1 0
            1 0 1
            1 0 1 0
            1 0 1 0 1

         * */
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column % 2 == 0 ? 0 + " " : 1 + " ");
            }
            System.out.println();

        }
    }
}
