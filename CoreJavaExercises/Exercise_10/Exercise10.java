public class Exercise10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Guess the number between 1 and 100!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            }
        }
        System.out.println("Congratulations! You guessed the number."); // Exercise 10 code here
    }
}
