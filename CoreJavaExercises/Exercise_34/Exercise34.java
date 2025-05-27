public class Exercise34 {
    public static void main(String[] args) {
        package com.utils;

public class Utils {
    public static void sayHello() {
        System.out.println("Hello from utils!");
    }
}module com.utils {
    exports com.utils;
}
package com.greetings;

import com.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Utils.sayHello();
    }
}

// Exercise 34 code here
    }
}
