package Office_Hours;

public class If_Practice {

    public static void main(String[] args) {


        int num = 305;

        if (num % 2 == 0) {
            System.out.println(num + "is even number");
        }
        if(num % 2 !=0){
            System.out.println(num+" is odd number");

            System.out.println("================");

            int score = 70;
            char grade = ' ';

            if(score >= 90 && score <= 100){
                grade = 'A';
            }else if(score >= 80 && score <=90){
                grade = 'B';
            }else if(score >=70 && score <80){
                grade = 'C';
            }else if(score >=60 && score <70){
                grade = 'D';
            }else{
                grade ='F';
            }
            System.out.println(grade);

            System.out.println("================");

            char grade2 =  (score >= 90 && score <= 100) ? 'A' :(score >= 80 )? 'B'
                    :(score >= 70 )?'C'  :(score >= 60 )? 'D' : 'F';

            System.out.println(grade2);



        }

    }
}
