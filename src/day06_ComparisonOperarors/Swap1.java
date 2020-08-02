package day06_ComparisonOperarors;

public class Swap1 {

    public static void main(String[] args) {
        int a = 22;
        int b = 30;

        int c = b; // c = 30;

        b = a;     // b = 30
        a = c;     // a = 22

        System.out.println(a); // 22
        System.out.println(b); // 30

    }
}
