package com.dhkpo.effectivejava.chapter01.item05.singleton;

import com.dhkpo.effectivejava.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private final Dictionary dictionary = new Dictionary();

    private SpellChecker() {}

    public static final SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
