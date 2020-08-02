package WarmUpTask.Practice_07_13_2020;
/* 1. Write a program that can return the
longest string of text from a String array
 */
public class Array_LongestString {
    public static void main(String[] args) {
          String[] arr ={"Apple","Pancake","Karnjanaburi","Jake","Jo"};

          int maxLength = arr[0].length();
          for(String each : arr) { // to fine max length
              if (each.length() > maxLength) {
                  maxLength = each.length();
              }

          }
          for(String each: arr){
              if(each.length() == maxLength){
                  System.out.println(each);
              }
          }
    }
}
