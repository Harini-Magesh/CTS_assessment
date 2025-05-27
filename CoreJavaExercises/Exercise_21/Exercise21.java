public class Exercise21 {
    public static void main(String[] args) {
         static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void customException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            } else {
                System.out.println("Valid age.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());// Exercise 21 code here
    }
}
