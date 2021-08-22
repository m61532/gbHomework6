package ru.geekbrains.lesson6;

public class Homework6 {

    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

//      QuantityCheck
        someAnimal.getAnimalQuantity();
        cat1.getCatQuantity();
        dog1.getDogQuantity();
        System.out.println();

//      MoveCheck
        someAnimal.run(10);
        someAnimal.swim(-12);

        System.out.println();

        cat2.run(100);
        cat2.run(210);
        cat2.run(-2);
        cat2.swim(10);
        cat2.swim(-10);

        System.out.println();

        dog2.run(300);
        dog2.run(510);
        dog2.run(-10);
        dog3.swim(5);
        dog3.swim(12);
        dog1.swim(-10);
    }
}
