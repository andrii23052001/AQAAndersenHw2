package lesson8.homework;

import java.util.*;
import java.util.stream.Collectors;

/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив
        (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово.*/
public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "orange", "grape", "kiwi",
                "pineapple", "melon", "apple", "grapefruit", "banana",
                "peach", "lemon", "kiwi", "orange", "apple",
                "strawberry", "banana", "watermelon", "grape", "mango"
        };
        uniqueWords(words);
        countOccurrencesAndPrint(words);
    }

    private static void uniqueWords(String[] words) {
        Set<String> uniqueWords = new TreeSet<>();//by alphabeted
        Collections.addAll(uniqueWords, words);
        System.out.println("List of unique words: " + uniqueWords);
    }

    private static void countOccurrencesAndPrint(String[] words) {
        List<String> wordList = Arrays.asList(words);
        Map<String, Long> wordCounts = wordList.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        wordCounts.forEach((word, count) -> System.out.println("Слово: " + word + ", Количество: " + count));
    }
}
