package com.dhkpo.effectivejava.chapter01.item05.staticutils;

import com.dhkpo.effectivejava.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    // 자원을 직접 명시하고 있음 -> 의존성 주입하도록 변경 필요
    private static final Dictionary dictionary = new Dictionary();

    private SpellChecker() {}

    public static boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
