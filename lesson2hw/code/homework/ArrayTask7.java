package homework;

/*
7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;

*/

import java.util.Arrays;


public class ArrayTask7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // Проход по массиву
        for (int i = 0; i < arr.length; i++) {
            // Проверка условия: если текущий элемент меньше 6
            if (arr[i] < 6) {
                // Умножение текущего элемента на 2
                arr[i] *= 2;
            }
        }

        // Вывод измененного массива на консоль
        System.out.println(Arrays.toString(arr));
    }
}