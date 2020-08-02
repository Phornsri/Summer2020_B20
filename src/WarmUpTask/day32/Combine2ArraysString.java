package WarmUpTask.day32;

import java.util.Arrays;

/* 3. create a method that can combine 2 arrays of String
 */
public class Combine2ArraysString {
    public static void main(String[] args) {
      String[] arr1 = {"Pancake","Cook","Yummy","Wings"};
      String[] arr2 = {"Tommy","Cybertek","Jackson"};
        System.out.println(Arrays.toString(combine2Arrays(arr1,arr2 ) ) );

    }
    public static String[] combine2Arrays(String[] arr1, String[] arr2) {
        String[] y = new String[arr1.length + arr2.length];

        int index = 0;

        for (String eachCharacter : arr1) {
            y[index] = eachCharacter;
            index++;
        }
        for (String eachCharacter : arr2) {
            y[index] = eachCharacter;
            index++;
        }
        return y;
    }
}
