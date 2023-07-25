package com.dhkpo.effectivejava.chapter02.item13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    public boolean isEmpty() {
        return size ==0;
    }

    // 코드 13-2 가변 상태를 참조하는 클래스용 clone 메서드
    // TODO stack -> elementsS[0, 1]
    // TODO copy -> elementsC[0, 1]
    // TODO elementsS[0] == elementsC[0]

    @Override public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            // 아래처럼 복사를 하지 않으면, 원래 객체와 clone 객체의 elements가 동일한 배열을 참조하게 된다.
            // deepcopy 가 필요한 경우라면, deepcopy 를 사용해야 한다.
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // 원소를 위한 공간을 적어도 하나 이상 확보한다.
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    // clone이 동작하는 모습을 보려면 명령줄 인수를 몇 개 덧붙여서 호출해야 한다.
    public static void main(String[] args) {
        Object[] values = new Object[2];
        values[0] = new PhoneNumber(123, 456, 7890);
        values[1] = new PhoneNumber(321, 764, 2341);

        Stack stack = new Stack();
        for (Object arg : values)
            stack.push(arg);

        Stack copy = stack.clone();

        System.out.println("pop from stack");
        while (!stack.isEmpty())
            System.out.println(stack.pop() + " ");

        System.out.println("pop from copy");
        while (!copy.isEmpty())
            System.out.println(copy.pop() + " ");

        System.out.println(stack.elements[0] == copy.elements[0]);
    }
}
