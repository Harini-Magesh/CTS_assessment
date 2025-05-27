public class Exercise20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero."); // Exercise 20 code here
    }
}
