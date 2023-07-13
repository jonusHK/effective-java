package com.dhkpo.effectivejava.chapter01.item05.springioc;

import com.dhkpo.effectivejava.chapter01.item05.IDictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringDictionary implements IDictionary {
    @Override
    public boolean contains(String word) {
        System.out.println("contains " + word);
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
