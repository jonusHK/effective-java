package com.dhkpo.effectivejava.chapter01.item03.functionalInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsageOfFunctions {

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1991, 2, 20));
        dates.add(LocalDate.of(1990, 9, 11));
        dates.add(LocalDate.of(2021, 4, 15));

        List<Integer> before2000 = dates.stream()
                .filter(d -> d.isBefore(LocalDate.of(2000, 1, 1)))
                .map(LocalDate::getYear)
                .toList();
    }
}
