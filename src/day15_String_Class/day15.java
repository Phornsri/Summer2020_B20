package day15_String_Class;
import java.util.Scanner;
public class day15 {

    public static void main(String[] args) {

        String name = "Tommy Zero";
        //             01234

        // charAt(index):
        char ch1= name.charAt(0); // 'T'
        char ch2 = name.charAt(4); // 'y'

        System.out.print(ch1);
        System.out.print(ch2);

        System.out.println();

        // length() ==> int
        int l =   name.length();
        System.out.println(l);

        // last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);





    }
}
