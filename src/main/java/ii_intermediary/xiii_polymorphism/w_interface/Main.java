package ii_intermediary.xiii_polymorphism.w_interface;

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
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = {dog, cat};

        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}
