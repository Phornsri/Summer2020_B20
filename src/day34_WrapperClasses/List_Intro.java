package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
           score.add(95); // autoBoxing 0
           score.add(100);           // 2
           score.add(85);           //  3
           score.add(75);          //   4
           score.add(1,65); // 1

           //score.add(6,55);

        System.out.println(score );

        //100;
        System.out.println(score.get(2) );


    }
}
