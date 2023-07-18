package com.dhkpo.effectivejava.chapter01.item07.cache;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryTest {

    @Test
    void cache() throws InterruptedException {
        PostRepository postRepository = new PostRepository();
        Integer p1 = 1;
        postRepository.getPostById(p1);

        assertFalse(postRepository.getCache().isEmpty());

        System.out.println("run gc");
        System.gc(); // 바로 실행된다는 보장은 없으나, 실행이 됨
        System.out.println("wait");
        Thread.sleep(3000L);

        assertTrue(postRepository.getCache().isEmpty());
    }

    /**
     * 백그라운드 스레드 사용하여 참조되지 않는 객체 제거
     */
    @Test
    void backgroundThread() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        PostRepository postRepository = new PostRepository();
        Integer p1 = 1;
        postRepository.getPostById(p1);

        Runnable removeOldCache = () -> {
            System.out.println("running removeOldCache task");
            Map<CacheKey, Post> cache = postRepository.getCache();
            Set<CacheKey> cacheKeys = cache.keySet();
            Optional<CacheKey> key = cacheKeys.stream().min(Comparator.comparing(CacheKey::getCreated));
            key.ifPresent((k) -> {
                System.out.println("removing " + k);
                cache.remove(k);
            });
        };

        System.out.println("The time is : " + new Date());

        executor.scheduleAtFixedRate(removeOldCache, 1, 3, TimeUnit.SECONDS);

        Thread.sleep(20000L);

        executor.shutdown();
    }
}
