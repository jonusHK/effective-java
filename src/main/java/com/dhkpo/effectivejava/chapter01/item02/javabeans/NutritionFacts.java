package com.dhkpo.effectivejava.chapter01.item02.javabeans;

import java.io.Serializable;

// 자바빈즈 패턴
public class NutritionFacts implements Serializable {
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;
    private boolean healthy;

    public NutritionFacts() {}

    public int servingSize() {
        return servingSize;
    }

    public int servings() {
        return servings;
    }

    public int calories() {
        return calories;
    }

    public int fat() {
        return fat;
    }

    public int sodium() {
        return sodium;
    }

    public int carbohydrate() {
        return carbohydrate;
    }

    public boolean healthy() {
        return healthy;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
}
