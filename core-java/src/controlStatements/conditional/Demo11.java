package controlStatements.conditional;

public class Demo11 {
    public static void main(String[] args) {
        int number = 5;
        switch (number) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("Five");
            default -> System.out.println("invalid number");
        }
    }
}
