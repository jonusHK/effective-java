package com.dhkpo.effectivejava.chapter01.item08.autocloseable;

public class App {

    public static void main(String[] args) {

        try(AutoCloseableIsGood good = new AutoCloseableIsGood()) {
            // TODO 자원 반납 처리가 됨
        }
    }
}
