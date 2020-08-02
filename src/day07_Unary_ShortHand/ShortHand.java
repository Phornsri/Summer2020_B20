package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {
        int a = 100;
        //a = a * a;
        a *= a;

        System.out.println(a);
        System.out.println("=================");
        int b = 2;
        b *= 3;
        System.out.println(b);
        System.out.println("===========");

        int x = 1;
        x = -x-- + x++ / -x-- * --x;
        System.out.println(x);
        System.out.println("==================");

        int c = 2;
        boolean res = ++c == 2 || --c == 2 && --c ==2;
        System.out.println(res);
        System.out.println("===========");

        int Apples = 20;
        int Oranges = 30;
        int Pears = 30;
        boolean com = Apples < Oranges || Oranges >= Pears;
        System.out.println(com);
        System.out.println("=================");

        boolean q = true, z = true;
        int y = 20;
        q = (y != 10) || (z = false);
        System.out.println(q);







    }
}
