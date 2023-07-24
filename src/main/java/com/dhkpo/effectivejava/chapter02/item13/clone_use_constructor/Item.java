package com.dhkpo.effectivejava.chapter02.item13.clone_use_constructor;

public class Item implements Cloneable {

    private String name;

    /**
     * 이렇게 구현하면 하위 클래스의 clone()이 깨질 수 있다. (절대 새로운 객체를 생성해서 리턴해서는 안된다.)
     */
    @Override
    public Item clone() {
        Item item = new Item(); // 반드시 super.clone() 을 사용해야 함
        item.name = name;
        return item;
    }
}
