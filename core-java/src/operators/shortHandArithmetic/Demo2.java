package operators.shortHandArithmetic;

public class Demo2 {
    public static void main(String[] args) {
        int a = 1;
        //a = a + 2;
        a += 2;
        System.out.println(a);//3

        int b = 10;
        //b = b - 5;
        b -= 5;
        System.out.println(b);

        int c = 10;
        //c = c * 10;
        c *= 10;
        System.out.println(c);

        int d = 100;
        //d = d /10;
        d /= 10;
        System.out.println(d);

        int e = 11;
        // e = e % 3;
        e %= 3;
        System.out.println(e);
    }
}
