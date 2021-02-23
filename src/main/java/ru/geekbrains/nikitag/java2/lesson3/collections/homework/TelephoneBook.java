package ru.geekbrains.nikitag.java2.lesson3.collections.homework;

import java.util.*;

public class TelephoneBook {
    Map<String, List<String>> book;

    public TelephoneBook(Map<String, List<String>> book) {
        this.book = book;
    }

    public void addPerson(String name, ArrayList<String> telephone) {
        book.put(name, telephone);
    }

    public Map<String, List<String>> getBook() {
        return book;
    }

    //Не могу разобраться, как нам работать с типом value для Map List<String>, постоянно ругается на неправильно предоставленный тип
    public void getPerson(String name) {
        Iterator iter = book.entrySet().iterator();
        while (iter.hasNext()) {
            System.out.println(name + ". Телефон: " + book.get(name));
            iter.next();

        }
    }
}
