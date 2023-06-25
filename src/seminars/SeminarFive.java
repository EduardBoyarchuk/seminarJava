package seminars;

import java.util.*;

public class SeminarFive {

    /*public static void main(String[] args) {
        Map<String, List<String>> knigaTelefonov = new HashMap<>();

        // Добавляем записи в телефонную книгу
        addContact(knigaTelefonov, "Ivanov", "1234567890");
        addContact(knigaTelefonov, "Petrov", "9876543210");
        addContact(knigaTelefonov, "Ivanov", "5555555555");
        addContact(knigaTelefonov, "Sidorov", "9999999999");
        addContact(knigaTelefonov, "Sidorov", "1111111111");

        // Создаем список имен сортированный по убыванию числа телефонов
        List<String> inemaSortir = new ArrayList<>(knigaTelefonov.keySet());
        inemaSortir.sort((name1, name2) -> knigaTelefonov.get(name2).size() - knigaTelefonov.get(name1).size());

        // Выводим отсортированные записи
        for (String name : inemaSortir) {
            System.out.println(name + ": " + knigaTelefonov.get(name));
        }
    }

    public static void addContact(Map<String, List<String>> telefon, String name, String telefonNimer) {
        List<String> tefonNomera = telefon.getOrDefault(name, new ArrayList<>());
        tefonNomera.add(telefonNimer);
        telefon.put(name, tefonNomera);
    }*/
}