package controlStatements.looping.forDemos;

public class Demo18Pattern1 {
    public static void main(String[] args) {
        /*
         *******
         *******
         *******
         *******
         *******
         *******
         *******
         * */
        for (int row = 1; row <= 70; row++) {
            for (int star = 1; star<=70;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
