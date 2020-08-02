package day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {
        for(int i = 1; i<= 50; i++){
            if(i%2 !=0){ // if the number is even, the skip
                continue;
            }
            System.out.println(i+" ");
        }
        for(int i =0; i <= 50; i++){  // in order to print odd, we can choose skip even number

            if(i % 2 == 0){ // if the number is even, then skip
                continue;
            }

            System.out.print(i+" ");

        }
    }

}
