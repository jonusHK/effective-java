package com.dhkpo.effectivejava.chapter01.item08.finalizer_attack;

import java.math.BigDecimal;

public class BrokenAccount extends Account {

    public BrokenAccount(String accountId) {
        super(accountId);
    }

    // finalize 를 오버라이딩 하여 finalizer 공격을 할 수 있다.
    @Override
    protected void finalize() throws Throwable {
        this.transfer(BigDecimal.valueOf(100), "hyeonkeun");
    }
}
