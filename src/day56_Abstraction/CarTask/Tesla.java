package day56_Abstraction.CarTask;

public class Tesla extends Car implements AutoPark, AutoPilot {

    public Tesla(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    @Override
    public void autopark() {
        System.out.println("Tesla is autopark");
    }

    @Override
    public void autopilot() {
        System.out.println("Tesla is an autopilot");
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting with button");
    }

    @Override
    public void driver() {
        System.out.println("Tesla is amazing car for driver!");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
