package lesson5.homeworkles5;

public class Main {
    public static void main(String[] args) {
        // Создание коробки с яблоками и добавление яблок
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        // Создание второй коробки с яблоками и добавление яблок
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        // Создание коробки с апельсинами и добавление апельсинов
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        // Вывод информации о цене коробок
        System.out.println("Price of appleBox1: " + appleBox1.getPrice());
        System.out.println("Price of appleBox2: " + appleBox2.getPrice());
        System.out.println("Price of orangeBox: " + orangeBox.getPrice());

        // Вывод информации о весе коробок
        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight());

        // Сравнение коробок по весу
        System.out.println("Is appleBox1 equals to appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("Is appleBox1 equals to orangeBox: " + appleBox1.compare(orangeBox));

        // Пересыпание фруктов из одной коробки в другую
        appleBox1.pourTo(appleBox2);

        // Вывод информации о весе коробок после пересыпания
        System.out.println("Weight of appleBox1 after pouring: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2 after pouring: " + appleBox2.getWeight());
    }
}
