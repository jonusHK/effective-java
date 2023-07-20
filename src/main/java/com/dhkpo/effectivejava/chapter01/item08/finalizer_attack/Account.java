package com.dhkpo.effectivejava.chapter01.item08.finalizer_attack;

import java.math.BigDecimal;

// final class 로 만들어서 상속을 못하게 하여 finalizer 공격을 막을 수 있다.
public class Account {

    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;

        if (accountId.equals("푸틴")) {
            throw new IllegalArgumentException("푸틴은 계정을 막습니다.");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }

    // finalize 를 상속 받지 못하게 하여 finalizer 공격을 막을 수 있다.
    // @Override
    // protected final void finalize() throws Throwable {}
}
