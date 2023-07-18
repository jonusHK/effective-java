package com.dhkpo.effectivejava.chapter01.item07.stack;

import com.sun.source.tree.EmptyStatementTree;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두배씩 늘린다.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    /* 메모리 누수 발생
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }*/

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args)
            stack.push(arg);

        while (true) {
            System.err.println(stack.pop());
        }
    }
}
