class Car {
    String brand;
    int year;

    // User-defined constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022); // Calls the user-defined constructor
        System.out.println(car1.brand); // Output: Toyota
        System.out.println(car1.year);  // Output: 2022
    }
}
