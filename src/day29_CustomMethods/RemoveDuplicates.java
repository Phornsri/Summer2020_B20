package day29_CustomMethods;

public class RemoveDuplicates {
    /* write a method that can remeove the duplicates from
the string */
    public static void removeDup(String str) {
        String nonDup = "";
        for(String each : str.split("")){
            if(!nonDup.contains(each) ){
                nonDup += each;
            }
        }

    }
}
