package com.dhkpo.effectivejava.chapter02.item11.hashtable;

import com.dhkpo.effectivejava.chapter02.item11.hashcode.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();
        PhoneNumber number1 = new PhoneNumber(123, 456, 7890);
        PhoneNumber number2 = new PhoneNumber(123, 456, 7890);

        System.out.println(number1.equals(number2));
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());

        map.put(number1, "hyeonkeun");
        map.put(number2, "cho");

        String s = map.get(new PhoneNumber(123, 456, 7890));
        System.out.println(s);
    }
}
