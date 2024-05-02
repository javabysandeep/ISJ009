package controlStatements.jumpStatements;

public class Demo1 {
    public static void main(String[] args) {
        // break; it cannot be outside of loops or switch
        for (;true;){
            System.out.println("for body");
            break;
        }
        System.out.println("rest of the main");
    }
}
