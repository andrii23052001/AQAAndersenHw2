package lesson5.homeworkles5.swap;

public class Main {
    public static void main(String[] args) {
        // Создаем массив целых чисел
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Выводим массив до обмена элементов
        System.out.println("Before swapping:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Меняем местами второй и четвертый элементы массива
        Swap.swap(intArray, 1, 3);

        // Выводим массив после обмена элементов
        System.out.println("After swapping:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}