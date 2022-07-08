package main;

import animals.Animals;
import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Animals cat = new Cat("Barsik");
        Animals dog = new Dog("Tuzik");
        System.out.println(cat.getClass());
        cat.voice();
        cat.run();
        System.out.println(dog.getClass());
        dog.voice();
        dog.run();
    }
}
