public class Car {
    String brand;
    int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void DisplayCarinfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Manufacture year: " + year);
    }

    public static void main(String[] args) {
        // Corrected comma between "BMW" and 1995
        Car myCar = new Car("BMW", 1995);
        myCar.DisplayCarinfo();
    }
}
