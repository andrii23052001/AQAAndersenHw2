package lesson4.homework;

class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
        satiety = false; // по умолчанию кот голоден
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean eat(Plate plate, int amount) {
        if (plate.getFood() >= amount) {
            plate.decreaseFood(amount);
            satiety = true;
            return true;
        }
        return false;
    }

    public boolean isSatiety() {
        return satiety;
    }
}

