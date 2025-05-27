public class Exercise39 {
    public static void main(String[] args) {
       import java.lang.reflect.Method;

public class ReflectExample {
    public void greet() {
        System.out.println("Hello from reflection!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectExample");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
        }

        Method greetMethod = clazz.getDeclaredMethod("greet");
        greetMethod.invoke(obj);
    }
}
 // Exercise 39 code here
    }
}
