package ii_intermediary.xiii_polymorphism.main;


class Animal {
    public void makeSound() {
        System.out.println("The animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says *woof woof*");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says *meow*");
    }
}

class Goat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Goat says *mee*");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Goat goat = new Goat();

        Animal[] animals = {dog, cat, goat};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

