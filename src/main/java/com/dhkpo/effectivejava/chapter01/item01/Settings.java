package com.dhkpo.effectivejava.chapter01.item01;

/**
 * 이 클래스의 인스턴스를 생성하는 경우 #getInstance()를 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }
}
