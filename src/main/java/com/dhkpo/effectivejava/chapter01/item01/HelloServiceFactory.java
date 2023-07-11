package com.dhkpo.effectivejava.chapter01.item01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        HelloService ko = HelloService.of("ko");
        System.out.println(ko.hello());

        HelloService eng = HelloService.of("eng");
        System.out.println(eng.hello());

        // 만약 다른 jar 에서 구현한 클래스를 가져오고 싶은 경우
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        for (HelloService helloService : loader) {
            System.out.println(helloService.hello());
        }

        // 리플렉션
        Class<?> aClass = Class.forName("com.dhkpo.effectivejava.chapter01.item01.KoreanHelloService");
        Method method = aClass.getMethod("hello");
        System.out.println(method.getReturnType());
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService = (HelloService) constructor.newInstance();
        System.out.println(helloService.hello());
    }
}
