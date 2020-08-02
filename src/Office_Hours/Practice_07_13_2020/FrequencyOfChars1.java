package Office_Hours.Practice_07_13_2020;

public class FrequencyOfChars1 {
    public static void main(String[] args) {
        String str = "OOPQQ"; // "O2P1Q2"
        String nonDup = ""; //"OPQQ"

        // Remove duplicates:
        for(int i = 0; i <=str.length() -1; i++){
            String s =" "+str.charAt(i);// O O P Q Q
            if(!nonDup.contains(s) ){
                nonDup += s;
            }
            System.out.print(nonDup );
        }

    }
}
