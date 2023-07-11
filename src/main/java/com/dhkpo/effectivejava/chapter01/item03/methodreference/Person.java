package com.dhkpo.effectivejava.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    LocalDate birthday;

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public Person() {}

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1991, 2, 20)));
        people.add(new Person(LocalDate.of(1990, 9, 11)));
        people.add(new Person(LocalDate.of(2021, 4, 15)));

        people.sort(Person::compareByAge);
    }
}
