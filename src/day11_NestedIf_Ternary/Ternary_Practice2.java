package day11_NestedIf_Ternary;
/*  write a program can compare two numbers
             a = 10;, b = 20
              output : b is greater

              a = 30, b = 10;
              output: a is greater

              a =20; b=20;
              output: a is equal to b
              */
public class Ternary_Practice2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 300;
        String result = (a>b)? " a is greater" :(b>a)? "b is greater" : " a is equal to b ";

        System.out.println(result );


    }


}
