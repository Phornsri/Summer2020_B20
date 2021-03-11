package day52_Exceptionss;

public class Error_Exception {
    public static void main(String[] args) {
        try{
            int[] myNums = {1,2,3};
            System.out.println(myNums[1]);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally{
            System.out.println("The 'try catch' is finished.");
        }
    }
}
