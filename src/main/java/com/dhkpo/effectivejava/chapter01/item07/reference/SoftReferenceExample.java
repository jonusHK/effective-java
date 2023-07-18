package com.dhkpo.effectivejava.chapter01.item07.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;

        System.gc(); // gc 발생 시, 메모리가 필요하다면 soft reference 를 삭제함
        Thread.sleep(3000L);

        System.out.println(soft.get());
    }
}
