package lesson4.homework_les4;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10); // Вызов конструктора суперкласса Animal
        dogCount++; // Увеличение счетчика при создании новой собаки
    }

    public static int getDogCount() {
        return dogCount;
    }
}
