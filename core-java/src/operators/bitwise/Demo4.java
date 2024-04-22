package operators.bitwise;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Logical Left shift operator");
        System.out.println(4 << 1); //8  -> 4 * 2^1
        System.out.println(4 << 2); //16 --> 4 * 2^2
        System.out.println(4 << 3); //32 --> 4 * 2^3
        System.out.println(4 << 4); //64 --> 4 * 2^4
        System.out.println(3 << 1); //6 --> 3 * 2^1
        System.out.println(3 << 2); //12 --> 3 * 2^2
        System.out.println(7 << 3); //7 * 2^3 --> 56

    }
}
