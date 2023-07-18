package com.dhkpo.effectivejava.chapter01.item06;

public class Deprecation {

    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */
    @Deprecated(forRemoval = true, since = "1.2") // 앞으로 삭제 될 예정이라고 표시
    public Deprecation() {}

    private String name;

    public Deprecation(String name) {
        this.name = name;
    }
}
