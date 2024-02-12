package lesson5.homework_les5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box { // Объявление класса Box
    public static void main(String[] args) { // Основной метод main
        List<Apple> boxWithApple1 = new ArrayList<>(); // Создание списка для коробки с яблоками 1
        for (int i = 0; i < 5; i++) { // Цикл для добавления 5 яблок в коробку 1
            boxWithApple1.add(new Apple());
        }
        printSeparator(); // Вызов метода для вывода разделительной строки
        System.out.println("Содержимое в первой коробке с яблоками: " + boxWithApple1); // Вывод содержимого коробки с яблоками 1
        getWeightApple(boxWithApple1); // Вызов метода для вывода веса коробки с яблоками 1
        List<Apple> boxWithApple2 = new ArrayList<>(); // Создание списка для коробки с яблоками 2
        for (int i = 0; i < 7; i++) { // Цикл для добавления 7 яблок в коробку 2
            boxWithApple2.add(new Apple());
        }
        printSeparator(); // Вызов метода для вывода разделительной строки
        System.out.println("Содержимое во второй коробке с яблоками: " + boxWithApple2); // Вывод содержимого коробки с яблоками 2
        getWeightApple(boxWithApple2); // Вызов метода для вывода веса коробки с яблоками 2

        List<Orange> boxWithOrange1 = new ArrayList<>(); // Создание списка для коробки с апельсинами 1
        for (int i = 0; i < 9; i++) { // Цикл для добавления 9 апельсинов в коробку 1
            boxWithOrange1.add(new Orange());
        }
        printSeparator(); // Вызов метода для вывода разделительной строки
        System.out.println("Содержимое в первой коробке с апельсинами: " + boxWithOrange1); // Вывод содержимого коробки с апельсинами 1
        getWeightOrange(boxWithOrange1); // Вызов метода для вывода веса коробки с апельсинами 1

        List<Orange> boxWithOrange2 = new ArrayList<>(); // Создание списка для коробки с апельсинами 2
        for (int i = 0; i < 11; i++) { // Цикл для добавления 11 апельсинов в коробку 2
            boxWithOrange2.add(new Orange());
        }
        printSeparator(); // Вызов метода для вывода разделительной строки
        System.out.println("Содержимое во второй коробке с апельсинами: " + boxWithOrange2); // Вывод содержимого коробки с апельсинами 2
        getWeightOrange(boxWithOrange2); // Вызов метода для вывода веса коробки с апельсинами 2

        compareBoxes(boxWithOrange1, boxWithApple1); // Вызов метода для сравнения весов коробок
        printSeparator(); // Вызов метода для вывода разделительной строки
        System.out.println("Пересыпаем яблоки с первой коробки во вторую!"); // Вывод сообщения о пересыпании яблок
        printSeparator(); // Вызов метода для вывода разделительной строки
        transferFruitIntoBoxFromAnotherBox(boxWithApple1, boxWithApple2); // Вызов метода для пересыпания яблок из первой коробки во вторую
        printSeparator(); // Вызов метода для вывода разделительной строки
        System.out.println("После пересыпания из первой коробки яблок во вторую, мы ожидаем что первая коробка должна быть пуста!"); // Вывод сообщения после пересыпания яблок
        getWeightApple(boxWithApple1); // Вызов метода для вывода веса первой коробки после пересыпания яблок
        printSeparator(); // Вызов метода для вывода разделительной строки
        transferFruitIntoBoxFromAnotherBox(boxWithOrange1, boxWithOrange2); // Вызов метода для пересыпания апельсинов из первой коробки во вторую
        System.out.println("После пересыпания из первой коробки апельсинов во вторую, мы ожидаем что первая коробка должна быть пуста!"); // Вывод сообщения после пересыпания апельсинов
        getWeightOrange(boxWithOrange1); // Вызов метода для вывода веса первой коробки после пересыпания апельсинов
        printSeparator(); // Вызов метода для вывода разделительной строки
    }

    private static int getWeightApple(List<Apple> boxWithApple) { // Метод для вычисления и вывода веса коробки с яблоками
        if (boxWithApple.isEmpty()) { // Проверка, пуста ли коробка
            System.out.println("Коробка пуста."); // Вывод сообщения о пустой коробке
        }

        int sumOfWeight = 0; // Инициализация переменной для хранения суммарного веса
        for (int i = 0; i < boxWithApple.size(); i++) { // Цикл для вычисления суммарного веса яблок в коробке
            sumOfWeight += boxWithApple.get(i).weight;
        }
        System.out.println("Кол-во кг яблок в коробке: " + sumOfWeight); // Вывод суммарного веса яблок в коробке
        return sumOfWeight; // Возвращение суммарного веса
    }

    private static void getWeightOrange(List<Orange> boxWithOrange) { // Метод для вычисления и вывода веса коробки с апельсинами
        double sumOfWeight = 0; // Инициализация переменной для хранения суммарного веса
        if (boxWithOrange.isEmpty()) { // Проверка, пуста ли коробка
            System.out.println("Коробка  пуста."); // Вывод сообщения о пустой коробке
        }
        for (Orange orange : boxWithOrange) { // Цикл для вычисления суммарного веса апельсинов в коробке
            sumOfWeight += orange.weight;
        }
        System.out.println("Кол-во кг апельсин в коробке " + sumOfWeight); // Вывод суммарного веса апельсинов в коробке
    }

    private static boolean compareBoxes(List<? extends Fruit> box1, List<? extends Fruit> box2) { // Метод для сравнения весов двух коробок
        double weightBox1 = box1.stream().mapToDouble(Fruit::getWeight).sum(); // Вычисление суммарного веса для коробки 1
        double weightBox2 = box2.stream().mapToDouble(Fruit::getWeight).sum(); // Вычисление суммарного веса для коробки 2

        boolean result = weightBox1 == weightBox2; // Проверка равенства весов
        if (result) { // Если веса равны
            System.out.println("Коробки равны по весу."); // Вывод сообщения о равенстве весов
        } else { // Иначе
            System.out.println("Коробки не равны по весу."); // Вывод сообщения о неравенстве весов
        }

        return result; // Возвращение результата сравнения
    }

    private static void transferFruitIntoBoxFromAnotherBox(List<? extends Fruit> box1, List<? extends Fruit> box2) { // Метод для пересыпания фруктов из одной коробки в другую
        double tmp = box1.stream().mapToDouble(Fruit::getWeight).sum(); // Вычисление суммарного веса фруктов в коробке 1
        double newBox = box2.stream().mapToDouble(Fruit::getWeight).sum() + tmp; // Вычисление суммарного веса фруктов в коробке 2 после пересыпания
        box1.clear(); // Очистка коробки 1
        System.out.println("Количество фруктов (кг) в коробке которое стало после пересыпания:" + newBox); // Вывод количества фруктов в коробке после пересыпания
    }

    private static void printSeparator() { // Метод для вывода разделительной строки
        System.out.println("============================================="); // Вывод разделительной строки
    }
}

 /*   Да, использование <? extends Fruit> в сигнатуре метода означает использование дженериков
        (обобщенных типов). В данном случае <? extends Fruit> обозначает ограничение типа: это значит, что в метод compareBoxes можно передать список, содержащий любой подтип класса Fruit, то есть список фруктов или любых его дочерних классов, например, List<Apple> или List<Orange>.

        Такой подход позволяет сделать метод более гибким и переиспользуемым,
        так как он будет работать с различными типами коробок, содержащими фрукты,
        без необходимости создавать отдельные методы для каждого типа коробок.*/