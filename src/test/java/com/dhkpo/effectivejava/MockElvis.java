package com.dhkpo.effectivejava;

import com.dhkpo.effectivejava.chapter01.item03.field.IElvis;

public class MockElvis implements IElvis {
    @Override
    public void sing() {
        System.out.println("You ain't nothing but a hound dog.");
    }

    @Override
    public void leaveTheBuilding() {

    }
}
