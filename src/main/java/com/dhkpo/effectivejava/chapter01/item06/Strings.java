package com.dhkpo.effectivejava.chapter01.item06;

public class Strings {

    public static void main(String[] args) {
        String hello = "hello";
        String hello2 = new String("hello"); // 계속 새로운 객체를 생성하므로 지양해야 함
        String hello3 = "hello";

        System.out.println(hello == hello2);
        System.out.println(hello.equals(hello2));
        System.out.println(hello == hello3);
        System.out.println(hello.equals(hello3));
    }
}
