package Office_Hours;
/* 1. write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it
*/
public class printNumbers {
    public static void main(String[] args) {
       for(int i= 1; i<=100;i++) {
           System.out.println(i + " ");

           if(i == 100){
               break;
           }
       }
    }
}
