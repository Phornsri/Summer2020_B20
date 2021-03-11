package day53_FinalKeyword;

public class try_catch_finally {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
                  //            0 1  2
            System.out.println(myNumbers[1]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
