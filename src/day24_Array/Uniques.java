package day24_Array;
/* 1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
 */
public class Uniques {
    public static void main(String[] args) {
        String str = "aabcc";

        String uniques = " "; //"b"

        for(int i = 0; i <=str.length() -1; i++){
            char ch = str.charAt(i); // a a b c c
            int first = str.lastIndexOf(ch); // 0 0
            int last = str.lastIndexOf(ch); // 1 1

            if(first == last){
                uniques += ch;
            }
        }

        System.out.print(uniques );

    }
}
