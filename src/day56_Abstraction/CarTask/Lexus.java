package day56_Abstraction.CarTask;

public final class Lexus extends Car implements AutoPark{

    public Lexus(String car, String model, int year, String color) {
        super(car, model, year, color);
    }

    @Override
    public void autopark() {
        System.out.println("Lexus is autopark");
    }

    @Override
    public void start() {
        System.out.println("Lexus is starting with start button");
    }

    @Override
    public void driver() {
        System.out.println("Lexus needs driver!");
    }

    @Override
    public String toString() {
        return "Lexus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
