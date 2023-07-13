package com.dhkpo.effectivejava.chapter01.item05.springioc;

import com.dhkpo.effectivejava.chapter01.item05.IDictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

//    @Bean
//    public SpellChecker spellChecker(IDictionary dictionary) {
//        return new SpellChecker(dictionary);
//    }
//
//    @Bean
//    public IDictionary dictionary() {
//        return new SpringDictionary();
//    }
}
