public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack", 7, "White", "Blue");
        dog.makeSound();
        dog.fetch();
        Parrot parrot = new Parrot("Luna", 2, "Blue", "Black");
        parrot.makeSound();
        parrot.fly();
        parrot.playWith();
    }
}