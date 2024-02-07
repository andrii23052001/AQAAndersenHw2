package lesson4.homework;

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В тарелке недостаточно еды.");
        }
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("В тарелке осталось еды: " + food);
    }
}