package lesson8.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Написать простой класс Телефонный Справочник, который хранит в себе
 * список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи,
 * а с помощью метода get()
 * искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов
 * (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 * Желательно не добавлять лишний функционал (дополнительные поля: имя, отчество, адрес),
 * взаимодействие с пользователем через консоль и т.д.
 * Консоль использовать только для вывода результатов проверки телефонного справочника.
 */
public class PhoneBook {
    private final Map<String, List<String>> records;
/*
    Поле records объявлено с ключевым словом final, что означает, что после инициализации его нельзя изменить.
*/
    public PhoneBook() {
        this.records = new HashMap<>();
    }
    public void add(String surname, String phoneNumber) {
        List<String> numbers = records.getOrDefault(surname, new ArrayList<>());
        numbers.add(phoneNumber);
        records.put(surname, numbers);
    }
    public List<String> get(String surname) {
        return records.getOrDefault(surname, new ArrayList<>());
    }
}