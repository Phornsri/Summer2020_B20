package day54_Abstraction.EmployeeTask;
/*
2. create a sub class of Employee named Tester(meant to be subClass ONLY)

 */

import java.time.LocalDate;

public final class Tester extends Employee { // can not be super class

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB ,jobTitle ,salary );

    }
    public void findBug(){
        System.out.println(name + "find a Bug");
    }

}
