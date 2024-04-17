package operators.arithmetic;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println(10 + 20);//30 --> mathematical addition
        System.out.println(10 + "20");//1020 --> string concatenation
        System.out.println(10 + "200");//10200 --> string concatenation
        System.out.println(10 + 20 * 10 - 10 / 1);//BODMAS --> 200
        System.out.println(10 + 20 * (10 - 10) / 1);//BODMAS --> 10
        System.out.println('A' + 'A' + "A");//130A
        System.out.println('A' + "A" + 'A'); //AAA
        System.out.println("A" + 'A' + 'A'); //AAA

    }
}
