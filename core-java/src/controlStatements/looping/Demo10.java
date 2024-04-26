package controlStatements.looping;

public class Demo10 {
    public static void main(String[] args) {
        for (int left = 0, right = 5; left < right; right++) {
            System.out.println(left + "\t" + right);
        }
        //0 5
        //0 6
        //0 7
        //0 8
        //0 9
        //...
    }
}
