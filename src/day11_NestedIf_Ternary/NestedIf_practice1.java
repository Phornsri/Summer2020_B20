package day11_NestedIf_Ternary;
/* 1. precoditoin : mininum salary of 30k
        sub codition : minimum 2 years of job history


   */
public class NestedIf_practice1 {
    public static void main(String[] args) {

        double salary = 1200;
        int jobHistory = 5;

        if(salary >=30000){
            if(jobHistory >= 2){
                System.out.println("You are qualified");
            }else{ // jobHistory < 2
                System.out.println("You mist have been on job at least 2 years ");
            }

        }else{
            System.out.println("You Must earn at least $30k");
        }
        System.out.println("==================");








    }
}
