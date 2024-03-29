package lesson4.homework_les4;

/*5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:

        ● Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).

        ● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.

        ● Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

        ● Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.

        ● Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.*/
public class Plate {
    private int foodAmount; // Количество еды в тарелке

    // Конструктор для инициализации тарелки заданным количеством еды
    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    // Метод для добавления еды в тарелку
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount; // Увеличиваем количество еды на заданную величину
            System.out.println("Добавлено " + amount + " еды в тарелку.");
        } else {
            System.out.println("Количество еды должно быть больше нуля.");
        }
    }

    // Метод для уменьшения количества еды в тарелке
    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount; // Уменьшаем количество еды на заданную величину
            System.out.println("Кот поел из тарелки. Осталось " + foodAmount + " еды.");
        } else {
            System.out.println("Недостаточно еды в тарелке.");
        }
    }

    // Метод для получения количества еды в тарелке
    public int getFoodAmount() {
        return foodAmount;
    }
}