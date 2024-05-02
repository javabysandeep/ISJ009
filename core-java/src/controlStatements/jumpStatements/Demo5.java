package controlStatements.jumpStatements;

public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("main method rest");
    }
}
