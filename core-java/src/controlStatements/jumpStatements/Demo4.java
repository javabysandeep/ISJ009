package controlStatements.jumpStatements;

public class Demo4 {
    public static void main(String[] args) {
        String[] emails = {"gmail", "outlook", "gmail", "hotmail", "yahoo"};
        for (int i = 0; i < 5; i++) {
            if (!emails[i].equals("gmail")) {
                continue;
            }
            System.out.println("email sent to gmail");
        }
    }
}
