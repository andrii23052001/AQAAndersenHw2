package lesson7.homework;

import java.io.*;
import java.util.Arrays;

public class CSVHelper {

    private final String filePath = "src/main/java/lesson7/homework/data.csv";

    // Метод для сохранения данных в файл CSV
    public void save(AppData appData) {
        try {
            // Проверяем, есть ли данные для сохранения
            if (appData.getData() == null || appData.getHeader() == null) {
                throw new IllegalArgumentException("Нет данных для сохранения");
            }
            // Используем try-with-resources для автоматического закрытия ресурса FileWriter
            try (FileWriter fileWriter = new FileWriter(filePath)) {
                // Записываем заголовок
                String tempHeader = String.join(",", appData.getHeader());
                fileWriter.write(tempHeader);
                fileWriter.append("\n");

                // Записываем строки данных
                for (int i = 0; i < appData.getData().length; i++) {
                    String row = String.join(",",
                            Arrays.stream(appData.getData()[i])
                                    .mapToObj(String::valueOf)
                                    .toArray(String[]::new)
                    );
                    fileWriter.append(row);
                    fileWriter.append("\n");
                }
            }
        } catch (IOException e) {
            // Обрабатываем исключение ввода/вывода, выбрасываем новое исключение с информацией об ошибке
            throw new RuntimeException(e);
        }
    }

    // Метод для загрузки данных из файла CSV
    public AppData load() {
        String row;
        AppData appData = new AppData();
        int numberOfRows = 0;
        BufferedReader bufferedReader = null;

        try {
            // Читаем файл с помощью BufferedReader
            bufferedReader = new BufferedReader(new FileReader(filePath));
            // Считываем и устанавливаем заголовок
            appData.setHeader(bufferedReader.readLine().split(","));
            int numberOfColumns = appData.getHeader().length;

            // Считаем количество строк данных
            while (bufferedReader.readLine() != null) {
                numberOfRows++;
            }

            bufferedReader.close();

            // Повторно открываем файл для считывания данных
            bufferedReader = new BufferedReader(new FileReader(filePath));
            bufferedReader.readLine();

            // Создаем массив для хранения данных
            int[][] data = new int[numberOfRows][numberOfColumns];

            int i = 0;
            // Считываем и парсим строки данных
            while ((row = bufferedReader.readLine()) != null) {
                String[] splittedRow = row.split(",");
                for (int j = 0; j < data[i].length; j++) {
                    data[i][j] = Integer.parseInt(splittedRow[j]);
                }
                i++;
            }
            // Устанавливаем данные в объект AppData
            appData.setData(data);
        } catch (IOException e) {
            // Обрабатываем исключение ввода/вывода, выбрасываем новое исключение с информацией об ошибке
            throw new RuntimeException(e);
        } finally {
            // Закрываем BufferedReader в блоке finally
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    // Обрабатываем исключение закрытия потока ввода, например, выводим сообщение об ошибке
                    System.out.println(e.getMessage());
                }
            }
        }
        // Возвращаем объект AppData с загруженными данными
        return appData;
    }
}