public class Exercise7 {
    public static void main(String[] args) {
           double myDouble = 9.78;
        int myInt = (int) myDouble; // casting double to int
        System.out.println("Double value: " + myDouble);
        System.out.println("Int value after casting: " + myInt);

        int myInt2 = 10;
        double myDouble2 = myInt2; // Implicit casting (int to double)
        System.out.println("Int value: " + myInt2);
        System.out.println("Double value after casting: " + myDouble2);// Exercise 7 code here
    }
}
