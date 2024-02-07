package homework1;

public class Cat extends Animal {
    private static int catCount = 0;
    private int appetite; // аппетит
    private boolean satiety; // сытость

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public Cat(String name, int appetite) {
        super(name, 200, 0); // Предположим, что коты не умеют плавать
        this.appetite = appetite;
        this.satiety = false; // При создании кота он голоден (сытость = false)
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    // Метод для кормления кота
    public void eat(Plate plate) {
        if (plate.getFoodAmount() >= appetite) { // Если в тарелке достаточно еды
            plate.decreaseFood(appetite); // Уменьшаем количество еды в тарелке на аппетит кота
            satiety = true; // Устанавливаем сытость кота в true
        } else {
            System.out.println("В тарелке недостаточно еды для кота " + name);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}