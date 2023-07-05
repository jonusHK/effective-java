package com.dhkpo.effectivejava.chapter01.item01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 생성자 대신 정적 팩토리 메서드를 고려하라.
 */
public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    /*
    public Order(Product product, boolean prime) {
        this.product = product;
        this.prime = prime;
    }

    public Order(boolean urgent, Product product) {
        this.product = product;
        this.urgent = urgent;
    }
    */

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        System.out.println(OrderStatus.DELIVERED.ordinal());
    }
}
