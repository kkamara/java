public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println(
                    "Scooby Doo says *Ruh Roh*."
                );
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
