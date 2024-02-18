package lesson7.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание начального объекта AppData
        AppData appData = new AppData(new String[]{"Value1", "Value2", "Value3"},
                new int[][]{{100, 200, 300}, {400, 500, 600}, {700, 800, 900}});

        // Создание объекта CSVHelper
        CSVHelper csvHelper = new CSVHelper();

        // Сохранение начального объекта AppData в файл CSV
        csvHelper.save(appData);

        // Вывод начального объекта AppData
        System.out.println("Начальные данные:");
        System.out.println(buildAppDataString(appData));

        // Загрузка объекта AppData из файла CSV
        AppData appDataFromFile = csvHelper.load();

        // Вывод загруженных данных
        System.out.println("\nЗагруженные данные из файла CSV:");
        System.out.println(buildAppDataString(appDataFromFile));
    }

    // Вспомогательный метод для создания строкового представления объекта AppData
    private static String buildAppDataString(AppData appData) {
        StringBuilder sb = new StringBuilder();
        String[] header = appData.getHeader();
        int[][] data = appData.getData();

        // Перебираем каждый заголовок и соответствующие данные
        for (int i = 0; i < header.length; i++) {
            sb.append(header[i]).append(" - ").append(Arrays.toString(data[i])).append("\n");
        }
        return sb.toString();
    }
}