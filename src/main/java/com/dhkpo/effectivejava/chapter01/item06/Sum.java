package com.dhkpo.effectivejava.chapter01.item06;

public class Sum {

    private static long sum() {
        // 오토박싱 : primitive type -> wrapper type
        // 언박싱 : wrapper type -> primitive type
        // Long sum = 0L; -> 불필요한 오토박싱이 되는것을 지양해야 함
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        long x = sum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms.");
        System.out.println(x);
    }
}
