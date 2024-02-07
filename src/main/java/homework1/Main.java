package homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Dog dog1 = new Dog("Рекс");
        animals.add(dog1);
        Dog dog2 = new Dog("Барон");
        animals.add(dog2);
        Dog dog3 = new Dog("Макс");
        animals.add(dog3);
        
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.swim(5);
                dog.run(300);
            }
        }

        Cat cat1 = new Cat("Мурзик", 50);
        animals.add(cat1);
        Cat cat2 = new Cat("Том", 40);
        animals.add(cat2);
        Cat cat3 = new Cat("Васька", 60);
        animals.add(cat3);

        Plate plate = new Plate(100);

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.eat(plate);
            }
        }

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(cat.name + " сытость: " + cat.isSatiety());
            }
        }

        plate.addFood(50);
        cat3.eat(plate);
        System.out.println(cat3.isSatiety());
    }
}
