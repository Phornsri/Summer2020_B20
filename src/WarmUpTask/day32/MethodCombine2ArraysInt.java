package WarmUpTask.day32;

import java.util.Arrays;

public class MethodCombine2ArraysInt {
    public static void main(String[] args) {
        int[] a = {1,2,3,500};
        int[] b = {2,4,6,800};
        int[] d = {3,7,8,900};

        System.out.println(Arrays.toString(combine3Arrays(a,b,d)) );

    }
    public static int[] combine3Arrays(int[] a, int[] b,int[] d){
        int[] c = new int[a.length + b.length + d.length ];

        int i = 0;
        // int[] a = {1,2,3};
        for(int each: a){
            c[i] = each;
            i++;
        }

        for(int each: b){
            c[i] = each;
            i++;
        }

        for(int each: d){
            c[i] = each;
            i++;
        }
        return c;


    }
}
