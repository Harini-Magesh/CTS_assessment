public class Exercise15 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed); // Exercise 15 code here
    }
}
