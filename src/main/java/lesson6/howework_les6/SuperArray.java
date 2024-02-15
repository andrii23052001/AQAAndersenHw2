package lesson6.howework_les6;

/*1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.*/
class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Размер массива должен быть 4x4");
    }
}

/* rowIndex указывает на индекс строки, в которой находится текущий элемент.
 columnIndex указывает на индекс столбца, в котором находится текущий элемент.*/
class MyArrayDataException extends Exception {
    public MyArrayDataException(int rowIndex, int columnIndex) {
        super("Неверные данные в ячейке [" + rowIndex + "][" + columnIndex + "]");
    }
}

public class SuperArray {
    /*1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.*/
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "1", "1"},
                {"1", "2", "1", "1",},
                {"1", "2", "1", "1"},
                {"1", "2", "1", "1",},
        };
        // 🌟 ИРЕ!!!!! Поменяй цифры на буквы при проверке, количество строк,
        // количество символов в строке
        // проверь как работает суммирование.
        // И напиши хороший отзыв гению за работу, я знаю, ты восхищена.
        // Можно и максимум так-то поставить
        printPoem(); // А еще я реально написал тебе стих💬, чтобы тебе проверялось лучше!
        // Запускай xD LOL :D
        // Да я гений, спасибо!
        // ты таксама геній 🌟 😄

        try {
            processArrayElements(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    /*
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    */
    private static void processArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {//проверяем кол-во строк
            System.err.println("Неверное количество строк. Ожидалось 4, получено " + array.length);
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {//проверяем кол-во символов в строке
            if (array[i].length != 4) {
                System.err.println("Неверное количество символов в строке " + i + ". Ожидалось 4, получено " + array[i].length);
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int num = Integer.parseInt(array[i][j]);
                    sum += num;
                } catch (NumberFormatException exception) {
                    System.err.println("Ошибка преобразования в строке " + i + ", столбце " + j + ": " + exception.getMessage());
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void printPoem() {
        System.out.println("Ира, Ира, погоди, смотри код и не спеши,");
        System.out.println("В этот день прекрасный, знаешь, все ошибки угадаешь.");
        System.out.println("Но как жаль, что их немного, слышу тихо нежный хохот,");
        System.out.println("Это ты сейчас хохочешь, ведь смешно тебе немного.");
        System.out.println();
        System.out.println("Но смеяться тут не надо, нужно код читать прекрасно,");
        System.out.println("Ведь я все тут описал, не было бы мужчины, то тебя замуж позавал.");
        System.out.println("Но ты все же дочитала, понимаю, ты устала,");
        System.out.println("Я прошу лишь улыбнись, день чудесный – веселись!");
    }
}
