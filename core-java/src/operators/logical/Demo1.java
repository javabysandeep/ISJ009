package operators.logical;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("logical AND Operation");
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println("logical OR Operation");
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        System.out.println("logical NOT Operation");
        System.out.println(!false);//true
        System.out.println(!true);//false
    }
}
