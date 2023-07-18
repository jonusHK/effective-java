package com.dhkpo.effectivejava.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(".");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            String name = "cho.hyeon.keun";
            SPLIT_PATTERN.split(name); // 단, 하나의 문자열로 string.split 시 오히려 미리 컴파일 한 것보다 더 빠를 수도 있다.
        }
        System.out.println(System.nanoTime() - start);
    }
}
