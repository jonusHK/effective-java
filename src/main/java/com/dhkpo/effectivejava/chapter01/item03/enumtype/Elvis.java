package com.dhkpo.effectivejava.chapter01.item03.enumtype;

import com.dhkpo.effectivejava.chapter01.item03.field.IElvis;

// 열거 타입의 싱글톤
public enum Elvis implements IElvis {

    INSTANCE;

    @Override
    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis.INSTANCE.leaveTheBuilding();
    }
}
