package SelfPractice;

public class HowToCalculate {
    public static void main(String[] args) {
        int a =50;
        a = -a-- + a++ + -a-- + --a;
        System.out.println(a);

        System.out.println("=======");

        int c = 25;
        System.out.println(c++);
        System.out.println(c--);
        System.out.println();
        System.out.println("==============");
        int x = 10;
        int y = 15;

        System.out.println(x);
        System.out.println(y);

        System.out.printf("===============");

        boolean x1 =true, z = true;
        int y1 = 20;
        x1 =(y1 != 10) || (z = false);
        System.out.println(x1 );
    }
}
