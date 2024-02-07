package lesson4.homework_les4;

import java.util.ArrayList;
import java.util.List;
/*
6. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
*/
public class Payment {
    private List<Item> items;

    public Payment() {
        this.items = new ArrayList<>();
    }

    // Внутренний класс Item представляет товары в покупке
    public class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    // Метод для добавления товара в покупку
    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    // Метод для получения общей суммы покупки с использованием стримов
    public double getTotalAmount() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    // Метод для получения списка товаров в покупке
    public List<Item> getItems() {
        return items;
    }

    // Пример использования
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Тетрадь", 3.5);
        payment.addItem("Ручка", 1.2);
        payment.addItem("Карандаш", 0.8);

        System.out.println("Список товаров в покупке:");
        payment.getItems().forEach(item ->
                System.out.println(item.getName() + ": " + item.getPrice() + " евро."));

        System.out.println("Общая сумма покупки: " + payment.getTotalAmount() + " евро.");
    }
}