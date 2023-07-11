package com.dhkpo.effectivejava;

import com.dhkpo.effectivejava.chapter01.item03.field.Concert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcertTest {

    @Test
    void perform() {
        Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStateOpen());
    }
}
