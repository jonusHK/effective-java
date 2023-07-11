package com.dhkpo.effectivejava.chapter01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor(); // 선언되어있는 기본 생성자 가져오기 (public, private 둘다 가져오기 가능), getConstructor() 는 public 접근제어자에만 가져 올 수 있음
            defaultConstructor.setAccessible(true); // 기본 생성자가 private method 라서 setAccessible = true 설정해야 함
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            System.out.println(elvis1 == elvis2);
            System.out.println(elvis1 == Elvis.INSTANCE);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
