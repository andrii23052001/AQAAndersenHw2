package lesson4.hw1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10);
    }

    public void run(int distance) {
        if (runLimit >= distance) {
            System.out.println("Собака: " + name + " пробежала: " + distance);
        } else {
            System.out.println("Собака " + name + " не может пробежать " + distance + " метров");
        }
    }

    public void swim(int distance) {
        if (swimLimit >= distance) {
            System.out.println("Собака: " + name + " проплыла: " + distance);
        } else {
            System.out.println("Собака " + name + " не может проплыть " + distance + " метров");
        }
    }
}

