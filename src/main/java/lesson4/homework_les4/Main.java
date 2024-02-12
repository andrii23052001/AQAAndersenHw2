package lesson4.homework_les4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        // Добавляем собак в список и выводим количество собак
        Dog dog1 = new Dog("Рекс");
        animals.add(dog1);
        Dog dog2 = new Dog("Барон");
        animals.add(dog2);
        Dog dog3 = new Dog("Макс");
        animals.add(dog3);
        System.out.println("=== Количество собак: " + Dog.getDogCount() + " ===");

        // Запускаем методы swim и run для каждой собаки
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.swim(5); // Пусть каждая собака проплывает 5 метров
                dog.run(300); // Пусть каждая собака пробегает 300 метров
            }
        }

        // Добавляем котов в список и выводим количество котов
        Cat cat1 = new Cat("Мурзик", 50); // Устанавливаем аппетит кота
        animals.add(cat1);
        Cat cat2 = new Cat("Том", 40);
        animals.add(cat2);
        Cat cat3 = new Cat("Васька", 60);
        animals.add(cat3);
        System.out.println("=== Количество котов: " + Cat.getCatCount() + " ===");

        // Создаем тарелку с едой и выводим общее количество животных
        Plate plate = new Plate(100);
        System.out.println("=== Общее количество животных: " + animals.size() + " ===");

        // Просим всех котов покушать из этой тарелки
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.eat(plate);
            }
        }

        // Выводим информацию о сытости котов
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(cat.name + " сытость: " + cat.isSatiety());
            }
        }
        // Добавляем еду в тарелку и пусть cat3 покушает
        plate.addFood(50);
        cat3.eat(plate);
        System.out.println(cat3.isSatiety());
    }
}
