package Office_Hours.Practice_08_24_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Recap {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>() ;
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5) );

        System.out.println(list1);

        for(int each : list1){
            System.out.println(each);
        }
        System.out.println("=============");

        ArrayList<Integer> list2 = new ArrayList<>();



    }
}
