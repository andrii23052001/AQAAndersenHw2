package lesson4.hw1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, 0);
    }

    public void run(int distance) {
        if (runLimit >= distance) {
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Кот " + name + " не может пробежать " + distance + " метров");
        }
    }

    public void swim(int distance) {
        if (distance>=swimLimit) {
            System.out.println("Котик " + name + " не умеет плавать:(");
        }
    }
}
