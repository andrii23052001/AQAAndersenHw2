package lesson1.homeworkLesson1;
/*1. Создать удаленный репозиторий на GitHub, подключить его к IDE в качестве проекта, добавить к нему модуль Maven. Создать новую ветку в репозитории в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().

        2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.

        Orange

        Banana

        Apple

        3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте
         их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
         и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
         в противном случае - “Сумма отрицательная”;

        4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;

        5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

        6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите, корректно ли они работают.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("That's All!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        compareNumbers1();
    }

    private static void printThreeWords() {
        System.out.println("===============================================");
        List<String> words = new ArrayList<>(List.of("Orange", "Banana", "Apple"));
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void checkSumSign() {
        System.out.println("===============================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста первое число!");
        int a = scanner.nextInt();
        System.out.println("Введите пожалуйста второе число!");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Ваша сумма положительная");
        } else {
            System.out.println("Ваша сумма отрицательная");
        }
        System.out.println("===============================================");
    }

    private static void printColor() {
        System.out.println("===============================================");
        Random random = new Random();
        int value = random.nextInt(301) - 100; // рандомное число от -100 до 200

        if (value <= 0) {
            System.out.println("Red");
        }
        if (value >= 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
        System.out.println("Generated value: " + value);
        System.out.println("===============================================");
    }

    private static void compareNumbers() {
        System.out.println("===============================================");
        int a = 1;
        int b = 2;
        int result = a >= b ? 1 : 2;

        switch (result) {
            case 1:
                System.out.println("a >= b");
                break;
            case 2:
                System.out.println("a < b");
                break;
        }
        System.out.println("===============================================");
    }

    private static void compareNumbers1() {
        System.out.println("===============================================");
        int a = 5;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("===============================================");
    }
}