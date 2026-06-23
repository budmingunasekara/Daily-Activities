package Abstraction;

public abstract class Animal {  // Create abstract class

    public void eat(){
        System.out.println("I am eating");

    }
    abstract public void makeSound();
}


class Dog extends Animal{ // Dog class called to parent class

    public void makeSound(){
        System.out.println("Woof Woof");
    }

}

class Cat extends Animal{ // Cat class called to parent class

    public void makeSound(){
        System.out.println("Meow Meow");
    }

}


class Main{
    public static void main(String[] args) {
        Animal D1 = new Dog();

        D1.eat();
        D1.makeSound();

        Animal C1 = new Cat();

        C1.eat();
        C1.makeSound();
    }
}
