package SelfPractice.CustomMethods_07_26_2020;
import java.util.Arrays;
public class ReturnStatements {
    public static void main(String[] args) {
        String question = caps("What are you doing today? ");
        System.out.println(question );

        int[] awesomeArray = combine3Arrays(3,7,1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);
    }
    public static String caps(String s){
        return s.toUpperCase();
    }
    public static int[] combine3Arrays(int a, int b, int c){
        int[] array = new int[3];
        array[0] =a;
        array[1] =b;
        array[2] = c;
        return array;
    }

}
