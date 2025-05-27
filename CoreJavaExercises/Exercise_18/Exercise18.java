public class Exercise18 {
    public static void main(String[] args) {
        static class Animal {
        public void makeSound() {
            System.out.println("Animal makes sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    public static void inheritanceExample() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();// Exercise 18 code here
    }
}
