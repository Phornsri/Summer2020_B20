package day48_Inheritance.AnimalTask;
/*
1. super class: Employee
                    variables: salary, name, id, jobTitle, gender
                    methods: setInfo, toString
 */

public class Employee {

    public String name;
    public String id;
    public char gender;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, String id, char gender, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nGender: " + gender + "\nJob Title: " + jobTitle + "\nSalary: " + getSalary();
    }
}



