package lesson4.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Dog dog1 = new Dog("Misha");
        animals.add(dog1);
        dog1.run(501);
        Cat cat1 = new Cat("Murzik");
        animals.add(cat1);
        Cat cat2 = new Cat("Basti");
        animals.add(cat2);
        cat1.run(20);
        dog1.swim(10);
        cat1.swim(10);
        pcsCats(animals);
        pcsDogs(animals);
        pcsAnimals(animals);

    }

    private static int pcsCats(List<Animal> animals) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                count++;
            }
        }
        System.out.println("Количество кошек в списке: " + count);
        return count;
    }

    private static int pcsDogs(List<Animal> animals) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                count++;
            }
        }
        System.out.println("Количество собак в списке: " + count);
        return count;
    }

    private static void pcsAnimals(List<Animal> animals) {
        System.out.println("Количество животных в списке: " + animals.size());
    }
}