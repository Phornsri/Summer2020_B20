package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class WarmUp {
    /*   1. write a program that can find the unique characters from a string
                DO NOT use nested loop
                "ABABCDEE"
                output: C D
        2. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
 */
    public static void main(String[] args) {
        String str =  "ABABCDEE";

        ArrayList<Character> char1 = new ArrayList<>();
          for(int i =0; i < str.length(); i++){
              char1.add(str.charAt(i) );
          }
          for(Character each : char1){
              if(Collections.frequency(char1, each) ==1) System.out.println(each + " ");
          }
        System.out.println("=============");

    }
    public static void frequencyCharacterFromAString(String str){
        String str2 = "AABBCCDDEE";


       

        }
}
