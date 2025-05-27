public class Exercise25 {
    public static void main(String[] args) {
         Map<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.println("Enter student ID to get name: ");
        int searchId = sc.nextInt();
        System.out.println("Student Name: " + studentMap.getOrDefault(searchId, "ID not found")); // Exercise 25 code here
    }
}
