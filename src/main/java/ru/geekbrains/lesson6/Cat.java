package ru.geekbrains.lesson6;

public class Cat extends Animal {

    private static int catQuantity;

    public Cat() {
        catQuantity++;
    }

    public void getCatQuantity() {
        System.out.println("Количество котов " + catQuantity);
    }

    @Override
    protected void run(int distance) {
        if (distance >= 0) {
            if (distance <= 200) {
                System.out.println("Кот пробежал " + distance + "м");
            } else {
                System.out.println("Расстояние " + distance + "м слишком большое для кота");
            }
        } else {
            System.out.println("Данное значение не может быть отрицательным");
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance >= 0) {
            System.out.println("Кот не умеет плавать");
        } else {
            System.out.println("Данное значение не может быть отрицательным, даже если бы кот умел плавать");
        }
    }
}
