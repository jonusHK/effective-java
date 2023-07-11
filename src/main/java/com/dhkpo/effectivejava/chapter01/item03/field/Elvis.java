package com.dhkpo.effectivejava.chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    /**
     * 싱글톤 오브젝트
     */
    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can't be created by constructor.");
        }
        created = true;
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    @Override
    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    public static void main(String[] args) {
        Elvis.INSTANCE.leaveTheBuilding();
    }

    // 역직렬화할 때 이 메서드를 사용하게 된다. (Override 메서드가 아님)
    private Object readResolve() {
        return INSTANCE;
    }
}
