package day56_Abstraction.CarTask;
/*
Ex3:
    Interface AutoPilot:
            autoPilot();
    Interface AutoPark:
             autoPark();
    abstract class Car:
            brand, model, year, color
        start();
        driver();
    Toyota: extends Car
         brand, model, year, color
         start(){}
         driver(){}
    Lexus: extends Car implements AutoPark
         brand, model, year, color
        start(){}
        driver(){}
        autoPark(){}
    Tesla: extends Car extends  implements AutoPilot, AutoPark
         brand, model, year, color
        start(){}
        driver(){}
        autoPilot(){}
        autoPark(){}

 */

public class Toyota extends Car {

    public Toyota (String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota is starting with key");
    }

    @Override
    public void driver() {
        System.out.println("Toyota is great method for driver");
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}

