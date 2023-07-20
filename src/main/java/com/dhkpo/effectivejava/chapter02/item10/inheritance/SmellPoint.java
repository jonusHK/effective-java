package com.dhkpo.effectivejava.chapter02.item10.inheritance;

import com.dhkpo.effectivejava.chapter02.item10.Point;

public class SmellPoint extends Point {

    private String smell;

    public SmellPoint(int x, int y, String smell) {
        super(x, y);
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;


        if (!(o instanceof SmellPoint))
            return o.equals(this);

        return super.equals(o) && ((SmellPoint) o).smell.equals(smell);
    }
}
