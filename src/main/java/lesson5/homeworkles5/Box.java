package lesson5.homeworkles5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    // Добавляет фрукт в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Вычисляет и возвращает общий вес фруктов в коробке
    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    // Вычисляет и возвращает общую стоимость фруктов в коробке
    public float getPrice() {
        float totalPrice = 0.0f;
        for (T fruit : fruits) {
            totalPrice += fruit.getPrice();
        }
        return totalPrice;
    }

    // Сравнивает текущую коробку с другой коробкой по их весу
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001f;
    }

    // Пересыпает все фрукты из текущей коробки в другую коробку
    public void pourTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
        for (T fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear();
    }
}
