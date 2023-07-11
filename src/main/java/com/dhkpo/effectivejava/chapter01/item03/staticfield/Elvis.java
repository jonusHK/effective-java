package com.dhkpo.effectivejava.chapter01.item03.staticfield;

// 정적 팩토리 방식의 싱글톤
public class Elvis implements Singer {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    // 장점. 클라이언트 코드는 변경하지 않으면서 내부 동작 방식을 변경 가능하다.
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

    @Override
    public void sing() {
        System.out.println("my way~");
    }
}
