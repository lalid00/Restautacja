package pl.restaurant.core.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private final Kitchen kitchen;
    private final List<Order> orders;
    private final List<Tables> availableTables;
    private final List<Tables> takenTables;


    public Restaurant(Kitchen kitchen, List<Order> orders) {
        this.kitchen = kitchen;
        this.orders = orders;
        this.availableTables = new ArrayList<>();
        this.takenTables = new ArrayList<>();
        availableTables.addAll(Arrays.asList(Tables.values()));
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "kitchen=" + kitchen +
                ",\norders=" + orders +
                '}';
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Tables> getAvailableTables() {
        return availableTables;
    }

    public List<Tables> getTakenTables() {
        return takenTables;
    }

    public Order getOrderByTable(int tableNumber){
        for (Order order : this.orders){
            if(order.getOrderData().getTableNumber().getNumber() == tableNumber){
                return order;
            }
        }
        return null;
    }
}
