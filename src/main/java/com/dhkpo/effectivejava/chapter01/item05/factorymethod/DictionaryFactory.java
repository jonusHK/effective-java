package com.dhkpo.effectivejava.chapter01.item05.factorymethod;

import com.dhkpo.effectivejava.chapter01.item05.Dictionary;
import com.dhkpo.effectivejava.chapter01.item05.IDictionary;

public class DictionaryFactory implements IDictionaryFactory {
    @Override
    public IDictionary getDictionary() {
        return new Dictionary();
    }
}
