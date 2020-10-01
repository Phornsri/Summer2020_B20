package day56_Abstraction.CarTask;

public abstract class Car {

  public String brand;
  public String model;
  public int year;
  public String color;

  public Car(String brand,String model,int year,String color){
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.color = color;
  }
    public abstract  void start();
    public abstract void driver();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
