public class Exercise23 {
    public static void main(String[] args) {
          try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file."); // Exercise 23 code here
    }
}
