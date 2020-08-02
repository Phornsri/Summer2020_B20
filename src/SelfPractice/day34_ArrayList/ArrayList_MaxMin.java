package SelfPractice.day34_ArrayList;

import java.util.ArrayList;

public class ArrayList_MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer>numList =new ArrayList<>();

        numList.add(21);
        numList.add(15);
        numList.add(85);
        numList.add(49);
        numList.add(56);
        numList.add(23);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer each : numList){
            if(each > max){
                max = each;
            }if(each < min){

            }
            System.out.println("Max:"+ max);
            System.out.println("Min:"+ min);
        }

    }
}
