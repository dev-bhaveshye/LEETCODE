package main;

abstract class Animal {
    // Abstract method (No implementation)
    abstract void makeSound();

    // Concrete method (Has implementation)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Child class MUST implement abstract methods
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Bark! Bark!
        dog.sleep();     // Output: Sleeping...
    }
}


