package com.dhkpo.effectivejava.chapter01.item07.cache;

import java.time.LocalDateTime;

public class CacheKey {

    private Integer value;

    private LocalDateTime created;

    public CacheKey(Integer value) {
        this.value = value;
        this.created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public boolean equals(Object o) {
        return this.value.equals(o);
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public String toString() {
        return "CacheKey{" +
                "value=" + value +
                ", created=" + created +
                '}';
    }
}
