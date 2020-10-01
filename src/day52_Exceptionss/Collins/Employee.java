package day52_Exceptionss.Collins;
/*
 2. create a subclass of person called Employee
            attributes: name, age, gender, ID, jobTitle, salary
            first constructor: can initialize name, age, gender of the employee
            second constructor: can initialize the entire attributes of the Employee class
 */

public class Employee extends Person {

    long id;
    String jobTitle;
    double salary;

    public Employee (String name,int age,char gender,long id,String jobTitle, double salary ) {

        super(name,age,gender);

        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }


    public String toString() {
        return "Employee{" +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


