package day54_Abstraction.EmployeeTask;
/*
1.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize lal those attributes
                        (even final variable you should initialize them within constructor)
            Action:
 */

import java.time.LocalDate;

public class Employee {

    public String name;

    public Employee(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public char gender;
    public LocalDate DOfB;
    public String jobTitle;
    public double salary;

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", DOfB: "+DOfB+", Job Title: "+jobTitle+", Salary $"+salary;
    }
}
