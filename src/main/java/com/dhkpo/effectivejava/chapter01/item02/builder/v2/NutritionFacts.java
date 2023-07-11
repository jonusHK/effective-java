package com.dhkpo.effectivejava.chapter01.item02.builder.v2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * Lombok Builder 사용
 * 단점
 * - 모든 필드에 대한 생성자가 생성됨
 * - Builder 생성자에 필수 필드에 대한 명시를 못함
 */

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE) // 외부에서 생성자 호출 불가
public class NutritionFacts {
    public final int servingSize;
    public final int servings;
    public final int calories;
    public final int fat;
    public final int sodium;
    public final int carbohydrate;

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFactsBuilder()
                .servingSize(100)
                .servings(10)
                .build();
    }
}
