package day07_Unary_ShortHand;

public class LeapYear2020 {

    public static void main(String[] args) {
        int year = 2020;
        boolean check = year%4==0;
        System.out.println(year+"is +Leapyear="+check);


        System.out.println("=========================");

        int num = 65;
        boolean check1 = num%2 ==0;
        System.out.println(num+" is divisible by 2 = " + check1);
        boolean check2 = num%3 ==0;
        System.out.println(num+" is divisible by 3 = " + check2);
        boolean check3 = num%5 ==0;
        System.out.println(num+" is divisible by 5 = " + check3);



    }
}
