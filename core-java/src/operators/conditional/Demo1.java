package operators.conditional;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(true ? "this is true" : "this is false");//this is true
        System.out.println(false ? "this is true" : "this is false");//this is false

        System.out.println(4 > 3 ? 4 : 3); //4
        System.out.println(4 < 3 ? 4 : 3); //3
    }
}
