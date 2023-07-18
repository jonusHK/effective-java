package com.dhkpo.effectivejava.chapter01.item07.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        BigObject strong = new BigObject();
        ReferenceQueue<BigObject> rq = new ReferenceQueue<>();

        // 무조건 ReferenceQueue 를 넣어줘야 함
        // PhantomReference 객체를 ReferenceQueue 에 넣어줌
        // 자원 정리할 때 사용하거나,
        BigObjectReference<BigObject> phantom = new BigObjectReference<>(strong, rq);
        strong = null;

        System.gc(); // gc 발생 시, phantom reference 는 ReferenceQueue 에 들어감
        Thread.sleep(3000L);

        System.out.println(phantom.enqueue());
        Reference<? extends BigObject> reference = rq.poll();
        BigObjectReference bigObjectCleaner = (BigObjectReference) reference;
        bigObjectCleaner.cleanUp();
        reference.clear();
    }
}
