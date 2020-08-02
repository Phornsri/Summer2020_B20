package day09_IfStatement;
/*
   1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.
​
       Note: MUST use if&else statement
    */
public class Triangle {
    public static void main(String[] args) {

            double angle1 = 60;
            double angle2 = 60;
            double angle3 = 60;
            if (angle1 + angle2 + angle3 == 180) {
                System.out.println("Triangle is valid");
            } else {
                System.out.println("Triangle is not valid");
            }
        System.out.println("=================");
/* 2. write a program that can check if the two characters (chars) are same characters
            if same, print: "Same characters"
            otherwise, print: "Different characters"
 */

        char num1 = 'A';
        char num2 = 'B';

        if(num1 ==num2){
            System.out.println("same characters");
        }else{
            System.out.println("different characters");
        }
        System.out.println("===========");

        /* 3. SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
 */
        int year = 2015;
        boolean eligibleToRecall1 = (year >= 1995 && year <= 1998)
                || (year >= 2001 && year<=2002)
                || (year>=2004 && year<=2006)
                || (year>=2015 && year<=2017);
        if(eligibleToRecall1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

}
