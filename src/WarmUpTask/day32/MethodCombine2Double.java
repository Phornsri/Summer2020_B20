package WarmUpTask.day32;

import java.util.Arrays;

/* 2. create a method that can combine 2 arrays of double
 */
public class MethodCombine2Double {
    public static void main(String[] args) {
        double[] e = {2,5,7,8,9,400};
        double[] r = {3,6,8,10,200,500};

        System.out.println(Arrays.toString(combine2DoublesArrays(e,r) ) );
    }
    public static double[] combine2DoublesArrays(double[] e, double[] r){
       double[] y = new double[e.length + r.length ];

       int z =0;
       //int[] e = {2,5,7,8,9};

       for(double eachNum : e){
           y[z] = eachNum;
           z++;
       }

        for(double eachNum : r){
            y[z] = eachNum;
            z++;
        }
        return y;

    }
}
