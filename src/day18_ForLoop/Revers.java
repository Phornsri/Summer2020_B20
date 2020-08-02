package day18_ForLoop;
/* write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
  */
public class Revers {
    public static void main(String[] args) {

        String str = "Java";
        // avaJ ==> ava , J

        String s1 = str.substring(1); // "ava"
        String s2 = str.substring(0,1); // "J"
        String result1 = s1 + s2; // "avaJ"

        System.out.println(result1); /// ythonP




    }
}
