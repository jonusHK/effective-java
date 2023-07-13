package com.dhkpo.effectivejava.chapter01.item05.dependencyinjection;

import com.dhkpo.effectivejava.chapter01.item05.Dictionary;
import com.dhkpo.effectivejava.chapter01.item05.IDictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final IDictionary dictionary;

    public SpellChecker(Supplier<IDictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
