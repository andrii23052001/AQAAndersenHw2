package homework;

import java.util.Arrays;

/*9.* Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа
        int длиной len, каждая ячейка которого равна initialValue;*/
// Объявление класса Task9
public class Task9 {
    // Основной метод программы
    public static void main(String[] args) {
        // Вызов метода ArrMethod с аргументами 7 и 4
        ArrMethod(7, 4);

        // Инициализация массива arr1
        int[] arr1 = {1, 2, 3};
        // Вызов метода shiftArray с массивом arr1 и аргументом 1
        shiftArray(arr1, 1);
        // Вывод измененного массива arr1 в консоль
        System.out.println(Arrays.toString(arr1)); // Ожидаемый результат: [3, 1, 2]

        // Инициализация массива arr2
        int[] arr2 = {3, 5, 6, 1};
        // Вызов метода shiftArray с массивом arr2 и аргументом -2
        shiftArray(arr2, -2);
        // Вывод измененного массива arr2 в консоль
        System.out.println(Arrays.toString(arr2)); // Ожидаемый результат: [6, 1, 3, 5]
    }

    // Метод для создания и заполнения массива
    private static int[] ArrMethod(int len, int initialValue) {
        // Создание массива указанной длины
        int[] newArray = new int[len];

        // Заполнение каждой ячейки массива значением initialValue
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = initialValue;
        }

        // Вывод массива на экран
        System.out.println(java.util.Arrays.toString(newArray));

        // Возвращение созданного массива
        return newArray;
    }

    /*   *** Написать метод, которому на вход подается одномерный массив и число n
               (может быть положительным, или отрицательным), при этом метод должен
       сместить все элементы массива на n позиций. Элементы смещаются циклично.
       Для усложнения задачи нельзя пользоваться вспомогательными массивами.
           Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
       [ 3, 5, 6, 1] при n = -2 (на два влево) ->
               [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/
    // Метод для смещения элементов массива на n позиций
    private static void shiftArray(int[] array, int n) {
        int len = array.length;
        // Используем оператор % для обеспечения циклического смещения
        n = (n % len + len) % len;

        // Вывод измененных элементов массива в консоль
        for (int i = 0; i < len; i++) {
            System.out.print(array[(i - n + len) % len] + " ");
        }
    }
}