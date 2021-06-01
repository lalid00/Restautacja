package pl.restaurant.core.calculations;

import pl.restaurant.core.model.Order;
import pl.restaurant.core.model.Restaurant;
import pl.restaurant.core.model.Tables;

import java.util.List;

public class TableAssigningCalculator {
    public static Tables calculate(Restaurant restaurant, Order order){
        List<Tables> availableTables = restaurant.getAvailableTables();
        int numOfPeople = order.getOrderData().getNumOfPeople();

        for (Tables table : availableTables){
            if(table.getSits() >= numOfPeople){
                order.getOrderData().setTableNumber(table);
                availableTables.remove(table);
                restaurant.getTakenTables().add(table);
                return table;
            }
        }
        return null;
    }

    public static boolean calculate(Restaurant restaurant, int numOfPeople){
        List<Tables> availableTables = restaurant.getAvailableTables();
        for (Tables table : availableTables){
            if(table.getSits() >= numOfPeople){
                return true;
            }
        }
        System.out.println("There is no table available for this many people. Please wait or come back later");
        return false;
    }
}
