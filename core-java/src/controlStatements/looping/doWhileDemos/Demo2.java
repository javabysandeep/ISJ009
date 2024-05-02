package controlStatements.looping.doWhileDemos;

public class Demo2 {
    public static void main(String[] args) {
        int number = 5;
        do {
            System.out.println(number);
            number--;
        } while (number < 6);
        //infinite 5, 4, 3, 2, 1...
    }
}
