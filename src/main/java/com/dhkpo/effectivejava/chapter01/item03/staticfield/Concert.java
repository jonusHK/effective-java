package com.dhkpo.effectivejava.chapter01.item03.staticfield;

import java.util.function.Supplier;

// 정적 팩토리의 메서드 참조를 공급자로 사용 할 수 있다
public class Concert {

    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(Elvis::getInstance);
    }
}
