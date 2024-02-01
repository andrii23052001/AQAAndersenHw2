package homework;

/*4. Написать метод, которому в качестве аргументов передается строка и число,
        метод должен
        отпечатать в консоль указанную строку, указанное количество раз;*/
// Объявление класса PrintApplTask4
public class PrintApplTask4 {
    // Основной метод программы
    public static void main(String[] args) {
        // Вызов метода Print с аргументами: строка "Hello" и количество раз - 3
        Print("Mama", 3);
        // Примеры использования метода
        checkAndPrintLeapYear(2000);
        checkAndPrintLeapYear(2024);
        checkAndPrintLeapYear(2100);
        checkAndPrintLeapYear(2023);
    }
    // Метод для отпечатки строки указанное количество раз
    private static void Print(String s, int n) {
        // Цикл для повторения отпечатки строки указанное количество раз
        for (int i = 0; i < n; i++) {
            // Вывод строки на консоль
            System.out.println(s);
        }
    }
/*    * Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом
        каждый 400-й – високосный.*/
// Метод для определения и печати информации о високосном годе
private static void checkAndPrintLeapYear(int year) {
    // Проверка условий для високосного года
    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Вывод информации о високосности года
    if (isLeap) {
        System.out.println(year + " - високосный год");
    } else {
        System.out.println(year + " - не високосный год");
    }
}
}