package com.dhkpo.effectivejava.chapter01.item03.functionalInterface;

import com.dhkpo.effectivejava.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {
        // 인자가 있고, 리턴값이 있는 경우
        Function<Integer, String> intToString = Object::toString;
        Function<LocalDate, Person> personFunction = Person::new; // LocalDate 인자를 받는 생성자를 가져옴

        // 인자가 없고, 리턴값이 있는 경우
        Supplier<Person> personSupplier = Person::new; // 기본 생성자를 가져옴

        // 인자가 있고, 리턴값이 없는 경우
        Consumer<Integer> integerConsumer = System.out::println;

        // 인자가 있고, boolean 을 리턴하는 경우
        Predicate<Integer> predicate;
    }
}
