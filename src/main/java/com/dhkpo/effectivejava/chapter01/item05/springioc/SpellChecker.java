package com.dhkpo.effectivejava.chapter01.item05.springioc;

import com.dhkpo.effectivejava.chapter01.item05.IDictionary;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpellChecker {

    private IDictionary dictionary;

    public SpellChecker(IDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
