package homework;

/*3. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное,
        и вернуть false если положительное. Замечание: ноль считаем положительным числом.*/
// Объявление класса TrueOrFalseTask3
public class TrueOrFalseTask3 {
    // Основной метод программы
    public static void main(String[] args) {
        // Вывод результата вызова метода CheckNumber с аргументом 1 на консоль
        System.out.println(CheckNumber(1));
    }

    // Метод для проверки числа на отрицательность
    private static boolean CheckNumber(int n) {
        // Проверка условия: если число меньше нуля
        if (n < 0) {
            // Возвращается значение true, если число отрицательное
            return true;
        } else {
            // Возвращается значение false, если число не отрицательное (включая ноль)
            return false;
        }
    }
}