package com.dhkpo.effectivejava.chapter01.item05.factorymethod;

import com.dhkpo.effectivejava.chapter01.item05.IDictionary;

import java.util.List;

public class SpellChecker {

    private IDictionary dictionary;

    public SpellChecker(IDictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
