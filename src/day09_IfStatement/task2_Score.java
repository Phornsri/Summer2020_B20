package day09_IfStatement;

public class task2_Score {
    public static void main(String[] args) {
        int grade = 75;
        if (grade > 90) {
            System.out.println("Excellent");}
        if (grade >70 || grade<90) {
            System.out.println("Good");}
        if (grade > 60 && grade<70) {
            System.out.println("Pass");}
        if (grade<60) {
            System.out.println("Fail"); }
    }
}
