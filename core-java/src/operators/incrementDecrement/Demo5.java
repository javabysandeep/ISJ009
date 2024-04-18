package operators.incrementDecrement;

public class Demo5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a++ + ++b + c-- + --d + ++a + --b);//15

        System.out.println(a);//3
        System.out.println(b);//2
        System.out.println(c);//2
        System.out.println(d);//3
    }
}
