package com.fnacdarty.darty;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Order {

    private final String id;
    private final Collection<Product> products;
    private final OrderState state;

    private final String ownerName;

    private Order(String id, Collection<Product> products, OrderState state, String ownerName) {
        this.id = id;
        this.products = List.copyOf(products);
        this.state = state;
        this.ownerName = ownerName;
    }

    public String getId() {
        return id;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public OrderState getState() {
        return state;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(products, order.products) &&
                state == order.state &&
                Objects.equals(ownerName, order.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products, state, ownerName);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                ", state=" + state +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private String id;
        private Collection<Product> products;
        private OrderState state;
        private String ownerName;

        public OrderBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public OrderBuilder withProducts(Collection<Product> products) {
            this.products = products;
            return this;
        }

        public OrderBuilder withState(OrderState state) {
            this.state = state;
            return this;
        }

        public OrderBuilder withOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Order build() {
            return new Order(id, products, state, ownerName);
        }
    }
}
