package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {

        int a = 2000;
        int b = 2000;

        if(a > b) {
            System.out.println(a + " is the maximum number");
        }

            if(b > a) {
                System.out.println(b + " is the max number");
            }

            if (a ==b){
                System.out.println("Both are equal");
            }
        System.out.println("=================");

            boolean BreakeTime = true;
             if (BreakeTime == true){
                 System.out.println("Take 15 minutes breake!");

                 if(BreakeTime ==false) {
                     System.out.println("Keep Studying!");
                 }

                 System.out.println("===================");
                 boolean corona = true;
                 System.out.println("Buy more toilet papers");
                 System.out.println("Buy more hand sanitizers");
                 System.out.println("Social Distance");
                 System.out.println("Stay at home!");
             }


        }
}
