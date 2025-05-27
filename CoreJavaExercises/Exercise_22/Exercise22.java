public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String text = sc.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(text);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file."); // Exercise 22 code here
    }
}
