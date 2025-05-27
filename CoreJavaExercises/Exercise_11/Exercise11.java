public class Exercise11 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);// Exercise 11 code here
    }
}
