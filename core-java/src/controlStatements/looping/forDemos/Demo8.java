package controlStatements.looping.forDemos;

public class Demo8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
            i--;
        }
        //output : 1,2, 3, 4, 5, 6, 7, 8, 9, 10
    }
}
