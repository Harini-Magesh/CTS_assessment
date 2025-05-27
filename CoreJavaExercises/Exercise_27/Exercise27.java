public class Exercise27 {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);
    }

    // 28. Stream API
    public static void streamAPI() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sum); // Exercise 27 code here
    }
}
