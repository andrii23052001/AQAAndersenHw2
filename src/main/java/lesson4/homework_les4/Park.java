package lesson4.homework_les4;

import java.util.ArrayList;
import java.util.List;
/*
7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
*/
public class Park {
    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    // Внутренний класс Attraction для представления аттракционов
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }

    // Метод для добавления аттракциона в парк
    public void addAttraction(String name, String workingHours, double price) {
        Attraction attraction = new Attraction(name, workingHours, price);
        attractions.add(attraction);
    }

    // Метод для получения списка всех аттракционов в парке
    public List<Attraction> getAttractions() {
        return attractions;
    }

    // Пример использования
    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Колесо обозрения", "10:00 - 20:00", 5.0);
        park.addAttraction("Американские горки", "12:00 - 22:00", 7.5);
        park.addAttraction("Водные горки", "11:00 - 18:00", 4.0);

        System.out.println("Аттракционы в парке:");
        for (Park.Attraction attraction : park.getAttractions()) {
            System.out.println("Название: " + attraction.getName());
            System.out.println("Режим работы: " + attraction.getWorkingHours());
            System.out.println("Стоимость: " + attraction.getPrice() + " евро\n");
        }
    }
}