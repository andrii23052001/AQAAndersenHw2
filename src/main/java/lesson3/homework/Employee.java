package lesson3.homework;


/*Для выполнения домашнего задания создайте ветку с названием урока (Например Lesson_3). Для каждого метода создавайте отдельный класс. Все классы поместите в один пакет (Например lesson_3). После выполнения ДЗ сделайте commit (git commit) и загрузите его в удаленный репозиторий  GitHub (git push).

        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

        2. Конструктор класса должен заполнять эти поля при создании объекта.

        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

        4. Создать массив из 5 сотрудников.

        Пример:

// Вначале объявляем массив объектов

        Person[] persArray = new Person[5];

// потом для каждой ячейки массива задаем объект

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);

        persArray[1] = new Person(...);

        ...

        persArray[4] = new Person(...);

        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/
public class Employee {

    private String fio;

    private String position;

    private String email;

    private String phone;

    private double salary;

    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee{\n" +
                        "  fio='%s',\n" +
                        "  position='%s',\n" +
                        "  email='%s',\n" +
                        "  phone='%s',\n" +
                        "  salary=%.2f,\n" +
                        "  age=%d\n" +
                        "}\n",
                fio, position, email, phone, salary, age
        );
    }

    public void show() {
        System.out.println(this.toString());
    }
}