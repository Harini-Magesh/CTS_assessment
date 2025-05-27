public class Exercise17 {
    public static void main(String[] args) {
           static class Car {
        String make;
        String model;
        int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayDetails() {
            System.out.println("Car Make: " + make);
            System.out.println("Car Model: " + model);
            System.out.println("Car Year: " + year);
                 }
    }

    public static void classAndObjectCreation() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.displayDetails();// Exercise 17 code here
    }
}
