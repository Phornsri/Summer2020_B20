package day08_LogicalOperators;

public class Logical_And_Or_Not {
    /* Returns true if both of the statements are true

     */
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println( 3< 4 && 5 < 7);
        boolean b = 10 == 10 && false;

        System.out.println(b);

        String breakfast = "pancake";
        boolean hot = true;
        boolean free = true;
        boolean bool = breakfast.equals("pancake") && hot && free;
        System.out.println(bool);

        // & &&. && is faster. short cirquit
        bool = breakfast.equals("pancake") & hot;
        bool = breakfast.equals("pancake") && hot;
        System.out.println(bool);





    }
}
