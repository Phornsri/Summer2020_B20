package day16_String;

import java.util.Scanner;

/* 1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana  */
public class SubString_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String str1 = scan.next(); // "Apple"

        System.out.println("Enter your second word");
        String str2 = scan.next(); // "Banana"

        // ppleanana
        // String result =   str1.substring(1).concat(  str2.substring(1)   );
        String result = str1.substring(1) + str2.substring(1);
        System.out.println(result);






    }
}
