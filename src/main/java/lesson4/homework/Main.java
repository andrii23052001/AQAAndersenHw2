package lesson4.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);

        Plate plate = new Plate(10);
        plate.info();

        for (Cat cat : cats) {
            if (cat.eat(plate, 10)) {
                System.out.println(cat.name + " поел и теперь сыт.");
            } else {
                System.out.println(cat.name + " не смог поесть, еды не хватило.");
            }
        }

        plate.info();
        dog.run(150);
        dog.swim(5);
        cat1.swim(5);
        cat2.run(1000);

        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество животных: " + Animal.getAnimalCount());

        System.out.println("Сытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + cat.isSatiety());
        }
    }
}