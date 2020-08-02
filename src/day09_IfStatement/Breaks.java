package day09_IfStatement;

public class Breaks {
    public static void main(String[] args) {
        String BreakesTime ="no";

        if(BreakesTime == "yes"){
            System.out.println("Take 15 mins breaks");
        }else{
            System.out.println("Continue the class");
        }
        System.out.println("====================");
        int a =500;
        int b = 900;
        if(a > b){
            System.out.println(a + " is greater");
        }
        else {
            if (b > a) {
                System.out.println(b + " is greater");
            }
        }

    }
}
