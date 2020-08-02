package day07_Unary_ShortHand;

public class Quiz {
    public static void main(String[] args) {

        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        //iNum = (int)fNum;
        fNum = iNum;
        dNum = fNum;
        fNum = (float)dNum;

        System.out.println("Result A" + 0 + 1);
        System.out.println("Result B" + (1) + 2);

        System.out.println("5 + 2 = " + 3 + 4);
        //                 "5 + 2 + 3" + 4

        System.out.println("5 + 2 = " + (3 + 4) );


        System.out.println("======================");


        int a = 3, b = 2;
        long c = (a+b)*2/3%2;
        System.out.println("a" + c);




    }


}
