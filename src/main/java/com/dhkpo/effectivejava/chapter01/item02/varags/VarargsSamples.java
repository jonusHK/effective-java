package com.dhkpo.effectivejava.chapter01.item02.varags;

import java.util.Arrays;

public class VarargsSamples {

    public void printNumbers(int... numbers) {
        System.out.println(numbers.getClass().getCanonicalName()); // 타입
        System.out.println(numbers.getClass().getComponentType()); // 배열이 갖고 있는 속성의 타입
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsSamples samples = new VarargsSamples();
        samples.printNumbers(1, 2, 3, 4, 5);
    }
}
