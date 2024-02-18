package lesson7.homework;

import java.util.Arrays;

public class AppData {
    private String[] header; // Массив заголовков колонок
    private int[][] data;    // Двумерный массив данных

    // Конструктор по умолчанию
    public AppData() {

    }

    // Конструктор для установки заголовков и данных при создании объекта
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    // Метод для установки данных
    public void setData(int[][] data) {
        this.data = data;
    }

    // Метод для установки заголовков
    public void setHeader(String[] header) {
        this.header = header;
    }

    // Метод для получения заголовков
    public String[] getHeader() {
        return header;
    }

    // Метод для получения данных
    public int[][] getData() {
        return data;
    }
}