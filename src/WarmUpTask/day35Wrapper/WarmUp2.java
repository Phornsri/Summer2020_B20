package WarmUpTask.day35Wrapper;
/*   2. write a program that can multiply each odd
number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
*/
import java.util.ArrayList;
public class WarmUp2 {
    public static void main(String[] args) {
        Integer number[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);

        int i = 0;
        for (Integer each : num) {
            if (each % 2 != 0) ;
            num.set(i, each * 2);
            i++;
        }
        System.out.println(num);
        System.out.println("==============");

        //task3
        //write a program that can find the unique elements from an
        // ArrayList of integers and stores into another list called uniques
        //            ex: list==> {1,1,2,3,3,4,5}
        //                uniques ==> {2,4,5}

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> uniques = new ArrayList<>();
        for (int y = 0; y<=list.size()-1; y++) {
            int count = 0;
            for (int z = 0; z<=list.size()-1; z++) {
                if(list.get(i) == list.get(z)){
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(y));
            }
        }
        System.out.println(uniques);


    }


}



