package day16_String;

import java.util.Scanner;

/* 6. write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scan.nextDouble();

        System.out.println("Enter second number");
        double num2 = scan.nextDouble();

        System.out.println("Enter math operator:");
        char operator = scan.next().charAt(0);

        boolean valid = operator == '*' || operator == '/'|| operator == '%' || operator == '+' || operator == '-';







    }
}
