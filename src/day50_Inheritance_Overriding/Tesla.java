package day50_Inheritance_Overriding;
/*
Tesla:
	start(): voice control
 */

import day50_Inheritance_Overriding.CarTask.Car;

public class Tesla extends Car  {
    public void start(){
        System.out.println("voice control");
    }
}
