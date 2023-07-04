package com.dhkpo.effectivejava.chapter01.item01;

import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) {
        HelloService ko = HelloService.of("ko");
        System.out.println(ko.hello());

        HelloService eng = HelloService.of("eng");
        System.out.println(eng.hello());

        // 만약 다른 jar 에서 구현한 클래스를 가져오고 싶은 경우
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        for (HelloService helloService : loader) {
            System.out.println(helloService.hello());
        }
    }
}
