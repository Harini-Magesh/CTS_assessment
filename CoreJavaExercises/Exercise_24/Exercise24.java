public class Exercise24 {
    public static void main(String[] args) {
          List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }

        System.out.println("Names entered: " + names);// Exercise 24 code here
    }
}
