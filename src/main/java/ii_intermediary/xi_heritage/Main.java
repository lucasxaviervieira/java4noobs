package ii_intermediary.xi_heritage;

class Animal {
    public void eat() {
        System.out.println("eating...");
    }
    public void makeSound() {
        System.out.println("The animal makes sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof woof!");
    }
    @Override
    public void makeSound() {
        System.out.println("*any sound*");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.makeSound();
    }
}
