package WarmUpTask;

public class Array_Score {
    public static void main(String[] args) {
        int[][] scores = { {10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135}   };
                      //          0                   1                  2

        for(int[] each : scores){
            for(int x : each){
                if(x % 5 ==0){
                    System.out.println(x);
                }
            }
        }
    }
}
