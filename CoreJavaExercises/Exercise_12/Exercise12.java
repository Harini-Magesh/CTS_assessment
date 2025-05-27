public class Exercise12 {
    public static void main(String[] args) {
           return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void methodOverloading() {
        System.out.println("Sum of 2 integers: " + add(10, 20));
        System.out.println("Sum of 2 doubles: " + add(10.5, 20.3));
        System.out.println("Sum of 3 integers: " + add(10, 20, 30));// Exercise 12 code here
    }
}
