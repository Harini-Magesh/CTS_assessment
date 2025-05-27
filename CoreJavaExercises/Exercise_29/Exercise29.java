import java.sql.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.net.http.*;
import java.net.URI;
import java.io.IOException;

public class Main {
    public class Exercise29 {
    public static void main(String[] args) {
           List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 20),
            new Person("Charlie", 25)
        );
        people.forEach(System.out::println);
        people.stream().filter(p -> p.age() >= 25).forEach(System.out::println);// Exercise 29 code here
    }
}
