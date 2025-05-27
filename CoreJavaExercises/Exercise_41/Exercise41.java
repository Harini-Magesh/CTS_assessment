public class Exercise41 {
    public static void main(String[] args) {
       import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
                () -> "Task 1",
                () -> "Task 2",
                () -> "Task 3"
        );

        List<Future<String>> results = service.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        service.shutdown();
    }
}
 // Exercise 41 code here
    }
}
