public class Exercise40 {
    public static void main(String[] args) {
       public class VirtualThreadsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Hello from virtual thread: " + Thread.currentThread());
            });
        }
    }
}
 // Exercise 40 code here
    }
}
