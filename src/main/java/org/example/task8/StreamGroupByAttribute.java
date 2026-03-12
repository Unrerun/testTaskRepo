package org.example.task8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupByAttribute {

    public static class Order {
        private final int id;
        private final int amount;
        private final String status;
        //Status maybe as enum;

        Order(int id, int amount, String status) {
            this.id = id;
            this.amount = amount;
            switch (status.toUpperCase()) {
                case "PENDING":
                case "COMPLETED":
                case "CANCELLED":
                    this.status = status;
                    break;
                default:
                    throw new RuntimeException("invalid status");
            }
        }

        public int getId() {
            return id;
        }

        public int getAmount() {
            return amount;
        }

        public String getStatus() {
            return status;
        }
    }

    public void orderList(List<Order> orders) throws NullPointerException {
        HashMap<String, List<Order>> ordersSortedByStatus = new HashMap<>(ordersSortedByStatus(orders));
        ordersSortedByStatus.forEach((key, value) -> {
            System.out.println("Status: " + key + "\n Max Amount: " + value.stream().mapToInt(Order::getAmount).max().orElse(0));

        });

    }

    private Map<String, List<Order>> ordersSortedByStatus(List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(Order::getStatus));


    }

}
