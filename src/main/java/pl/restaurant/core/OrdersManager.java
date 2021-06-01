package pl.restaurant.core;

import pl.restaurant.core.calculations.ChefAssigningCalculator;
import pl.restaurant.core.calculations.TableAssigningCalculator;
import pl.restaurant.core.model.*;

import java.util.List;

public class OrdersManager {

    public static List<Chef> assignChef(Kitchen kitchen, Order order){
        Chef chef = ChefAssigningCalculator.calculate(kitchen);
        chef.getOrders().add(order);
        return kitchen.getChefs();
    }

    public static Tables assignTable(Restaurant restaurant, Order order){
        return TableAssigningCalculator.calculate(restaurant,order);
    }
}
