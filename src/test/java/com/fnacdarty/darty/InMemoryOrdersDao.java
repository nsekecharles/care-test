package com.fnacdarty.darty;

import java.util.Collection;
import java.util.List;

public class InMemoryOrdersDao implements OrdersDao {

    @Override
    public Collection<Order> getOrders() {
        return List.of(order1(), order2(), order3(), order4());
    }

    private static Product aProduct(String name, Float price) {
        return new Product(name, price);
    }

    private static Order order1() {

        return Order.builder()
                .withId("1")
                .withOwnerName("Amandine")
                .withState(OrderState.DELIVERY_IN_PROGRESS)
                .withProducts(List.of(aProduct("Lave Linge", 420f)))
                .build();
    }

    private static Order order2() {

        return Order.builder()
                .withId("2")
                .withOwnerName("Amandine")
                .withState(OrderState.DELIVERED)
                .withProducts(List.of(aProduct("seche linge", 220f), aProduct("Lave vaisselle", 300f)))
                .build();
    }

    private static Order order3() {

        return Order.builder()
                .withId("3")
                .withOwnerName("Marc")
                .withState(OrderState.DELIVERED)
                .withProducts(List.of(aProduct("TV 4k Samsung", 1000.35f), aProduct("Lave vaisselle", 300f)))
                .build();
    }

    private static Order order4() {

        return Order.builder()
                .withId("4")
                .withOwnerName("James")
                .withState(OrderState.DELIVERY_IN_PROGRESS)
                .withProducts(List.of(aProduct("Téléphone", 200.50f)))
                .build();
    }

}
