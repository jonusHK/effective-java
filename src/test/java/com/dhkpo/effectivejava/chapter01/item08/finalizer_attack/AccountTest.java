package com.dhkpo.effectivejava.chapter01.item08.finalizer_attack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class AccountTest {

    @Test
    void 일반_계정() {
        Account account = new Account("hyeonkeun");
        account.transfer(BigDecimal.valueOf(10.4),"hello");
    }

    @Test
    void 푸틴_계정() throws InterruptedException {
        Account account = null;
        try {
            account = new BrokenAccount("푸틴");
        } catch (Exception exception) {
            System.out.println("이러면 BrokenAccount 객체가 생성되다 말았더라도, gc 실행 시 finalize 메서드가 호출된다.");
        }

        System.gc();
        Thread.sleep(3000L);
    }
}