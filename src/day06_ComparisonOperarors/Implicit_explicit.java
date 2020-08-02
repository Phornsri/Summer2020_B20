package day06_ComparisonOperarors;

public class Implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1; // implicit casting : manully done

        long l2 = (long)s1; // if we implicit manully
        int I1 = 300;
        double D1 = I1; // 300.0

        System.out.println(D1);
    }
}
