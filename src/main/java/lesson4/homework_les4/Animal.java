package lesson4.homework_les4;

// Создаем класс Animal
public class Animal {
    // Поля класса
    protected String name; // Имя животного
    protected int runLimit; // Предел бега
    protected int swimLimit; // Предел плавания

    // Конструктор класса Animal
    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name; // Инициализация имени
        this.runLimit = runLimit; // Инициализация предела бега
        this.swimLimit = swimLimit; // Инициализация предела плавания
    }

    // Метод для бега животного
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    // Метод для плавания животного
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}
