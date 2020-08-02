package day09_IfStatement;
/* 1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
*/
public class If_Statements1234 {
    public static void main(String[] args) {
        int a = 5;
        int b= 7;
        int c= 8;
        if (a > b && a > c ) {
            System.out.println(a + " is the maximum number");
        }
        if (c > b && c > a ){
            System.out.println(c + " is the maximum number");
        }
        if (b > c && b > a){
            System.out.println(b + " is the maximum number");
        }
        System.out.println("=======================");
        // 2. write a java program that accepts three numbers and return the minimum number
        //        (assume that none of them are equal)
        int d = 5;
        int e= 7;
        int f= 8;
        if (d < e && d < f ) {
            System.out.println(d + " is the minimum number");
        }
        if (e < d && e < f ){
            System.out.println(e + " is the minimum number");
        }
        if (f < d && f < e){
            System.out.println(f + " is the minimum number");
        }

        System.out.println("=========================");
        //        3. write a java program that accepts three numbers and rteurn the mediam number
        //                (assume that none of them are equal)

        int g = 5;
        int h= 7;
        int i= 8;
        if (g < h && h < f ) {
            System.out.println(e + " is the median number");
        }
        if (h < i && i < g ){
            System.out.println(i + " is the median number");
        }
        if (i < g && g < h){
            System.out.println(g + " is the median number");
        }
        System.out.println("=================================");

        //        4. write a java program that can identify if a person is eligible to buy alcohol

        byte age = 22;
        String name = "James";
        Boolean eligibleToBuyAlcohol = age >= 22;
        if (eligibleToBuyAlcohol == true){
            System.out.println(name+ " is eligible to buy alcohol: " + eligibleToBuyAlcohol);
        }
        System.out.println("======================");
        boolean hasID = true;
        int Age = 26;

        boolean eligible = hasID && age >= 21;
        //                  true &&  false ==> false

        String result = "";

        if(eligible == true){
            //  System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }

        if(eligible == false){
            //   System.out.println("Go buy milk");
            result = "You are not old enough to buy alcohol";
        }

        System.out.println(result);

    }



}






