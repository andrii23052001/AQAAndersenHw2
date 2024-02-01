package homework;

/*2. Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали
        или отрицательное. Замечание: ноль считаем положительным числом.*/

// Объявление класса PositiveOrNegativeTask2
public class PositiveOrNegativeTask2 {
    // Основной метод программы
    public static void main(String[] args) {
        // Вызов метода CheckNumber с аргументом 0
        CheckNumber(0);
    }

    // Метод для проверки числа на положительность или отрицательность
    private static void CheckNumber(int number) {
        // Проверка условия: если число больше или равно нулю
        if (number >= 0) {
            // Вывод сообщения о том, что число положительное
            System.out.println(number + ": Positive!");
        } else {
            // Вывод сообщения о том, что число отрицательное
            System.out.println(number + ": Negative");
        }
    }
}