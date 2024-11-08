package ii_intermediary.xiii_polymorphism.dynamic;

import java.util.Scanner;

interface Animal {
    public void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("*woof woof*");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("*meow*");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Animal animal;

        System.out.println("Choose an animal: (1 - Dog, 2 - Cat)");
        int option = reader.nextInt();

        if (option == 1) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }

        animal.makeSound();

    }
}
