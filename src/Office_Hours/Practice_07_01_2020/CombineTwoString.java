package Office_Hours.Practice_07_01_2020;
/*  1. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight */
public class CombineTwoString {
    public static void main(String[] args) {

        String str1 = "one";
        String str2 = "eight"; // ight
                      // 01234

        // OneTwo
        char ch1 = str1.charAt(str1.length() - 1); // last char from str1
        char ch2 = str2.charAt(0); // first char from str2

        if (ch1 == ch2) {
            System.out.println(str1 + str2.substring(1));// excluding the first character of the second

        }else{
            System.out.println(str1+str2);

            System.out.println("===========");





        }
    }
}
