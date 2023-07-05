package com.dhkpo.effectivejava.chapter01.item01;

public interface HelloService {

    String hello();

    // java8 에 등장한 public static 메소드
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    default String hi() {
        return "hi";
    }
}
