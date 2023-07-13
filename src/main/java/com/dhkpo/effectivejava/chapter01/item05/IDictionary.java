package com.dhkpo.effectivejava.chapter01.item05;

import java.util.List;

public interface IDictionary {
    public boolean contains(String word);

    public List<String> closeWordsTo(String typo);
}
