package com.dhkpo.effectivejava.chapter02.item10.inheritance;

import com.dhkpo.effectivejava.chapter02.item10.Color;

public class SmellPointTest {
    
    public static void main(String[] args) {
        // SmellPoint 와 ColorPoint 가 서로 equals 를 무한정 호출하게 되면서 StackOverflowError 발생
        SmellPoint p1 = new SmellPoint(1, 0, "sweat");
        ColorPoint p2 = new ColorPoint(1, 0, Color.RED);
        p1.equals(p2);
    }
}
