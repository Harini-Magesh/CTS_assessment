public class Exercise14 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);// Exercise 14 code here
    }
}
