package day10_IfStatements;
/* write a program that can check the equality of the three given numberrs
            declare 3 numbers n1, n2, n3
            if n1 and n2 are equal and not equal to n3  => n1&n2 are equal
            if n2 and n3 are equal and not equal to n1==> n2&n3 are equal
            if n3 and n1 are equal and not equal to n2 ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are euqal ==> none of them are equal
 */
public class If_Equality {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        int n3 = 400;
        String Equal = "";

        if(n1==n2 && n1 != n3 && n2 != n3){
            Equal = "n1 & n2 are equal";
        }else if(n2==n3 && n2 !=n1 && n3 != n1 ){
            Equal  = "n2 & n3 are equal";
        }else if(n3==n1 && n3 !=n2 && n1 !=n2){
            Equal  = "n3 and n1 are equal";
        }else if(n1==n2 && n2==n3 && n3==n1){
            Equal  = "all equal";
        }else{
           Equal  = "none of them are equal";
        }
        System.out.println(Equal );

    }
}