package day31_Recap;

public class WarmUp_Tasks {
    /*  1.  write a return method called frequency that accepts two
    parameters: string str and char ch, the method
    returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
 */
    public static void main(String[] args) {
        String str ="aabcccd";
        int count = frequency(str,'a');
        System.out.println(count);
    }

    public static int frequency(String str, char ch){
        int count =0;
        for(char each :str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }
        return count;
    }
}
