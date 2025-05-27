public class Exercise19 {
    public static void main(String[] args) {
           interface Playable {
        void play();
    }

    static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Guitar is playing");
        }
    }

    static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Piano is playing");
        }
    }

    public static void interfaceImplementation() {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();// Exercise 19 code here
    }
}
