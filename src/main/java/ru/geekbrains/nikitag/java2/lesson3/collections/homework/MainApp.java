package ru.geekbrains.nikitag.java2.lesson3.collections.homework;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "Cat", "Cat", "Dog", "Better",
                "Better", "Day", "Cat", "Better",
                "Then", "Cat", "Day", "Better",
                "Day", "Better", "Cat", "Dog",
                "Can", "Do", "While", "Cat", "Better"));

        //Убираем повторения
        removeClones(list);
        //Считаем значения
        countList(list);



        System.out.println("");
        //Задание №2 Телефонный справочник
        System.out.println("Задание 2 - Телефонный справочник");

        TelephoneBook book1 = new TelephoneBook(new HashMap<>());
        book1.addPerson("Kirill", new ArrayList<>(Arrays.asList("51-52-53", "54-56-67")));
        book1.addPerson("Kirill", new ArrayList<>(Arrays.asList("51-3-53", "54-564-67")));
        book1.addPerson("Vasia", new ArrayList<>(Arrays.asList("54-522-53", "414-99-67")));
        book1.addPerson("Fokiar", new ArrayList<>(Arrays.asList("54-838-67")));
        book1.addPerson("Fokiar", new ArrayList<>(Arrays.asList("41-5112-53")));
        book1.addPerson("Gavriil", new ArrayList<>(Arrays.asList("56-582-41")));
        book1.getPerson("Vasia");

    }

    //Мне кажется интересный вариант через Set убрать двойников :) + можно прикрутить compare
    public static Set<String> removeClones(List<String> list) {
        Set<String> tempSet = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            tempSet.add(list.get(i));
        }
        System.out.println(tempSet);
        return tempSet;
    }

    //Подсчёт через создание второй таблицы и удаления её элементов по мере наращивания счётчика
    public static void countList(List<String> list) {
        List<String> list2 = list;
        do {
            Iterator<String> iter = list2.iterator();
            int counter = 0;
            String tempName = list2.get(0);
            while (iter.hasNext()) {
                String str = iter.next();
                if (str.equals(tempName)) {
                    counter++;
                    iter.remove();
                }
            }
            System.out.println(tempName + " встречается в списке " + counter + " раз.");
        } while (list2.size() != 0);
    }



}
