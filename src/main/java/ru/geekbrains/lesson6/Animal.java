package ru.geekbrains.lesson6;

public class Animal {

    private static int animalQuantity;

    public Animal() {
        animalQuantity++;
    }

    public void getAnimalQuantity() {
        System.out.println("Количество животных в целом – " + animalQuantity);
    }

    protected void run(int distance) {
        if (distance >= 0) {
            System.out.println("Животное пробежало " + distance + "м");
        } else {
            System.out.println("Данное значение не может быть отрицательным");
        }
    }

    protected void swim(int distance) {
        if (distance >= 0) {
            System.out.println("Животное проплыло " + distance + "м");
        } else {
            System.out.println("Данное значение не может быть отрицательным");
        }
    }
}
