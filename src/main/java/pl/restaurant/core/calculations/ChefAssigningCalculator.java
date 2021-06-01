package pl.restaurant.core.calculations;

import pl.restaurant.core.model.Chef;
import pl.restaurant.core.model.Dish;
import pl.restaurant.core.model.Kitchen;
import pl.restaurant.core.model.Order;

import java.util.List;

public class ChefAssigningCalculator {
    public static Chef calculate(Kitchen kitchen){
        List<Chef> chefs = kitchen.getChefs();
        int min = Integer.MAX_VALUE;
        Chef soonestAvailableChef = null;
        for (Chef chef: chefs) {
            int sum = 0;
            //iterating through orders
            for(Order order : chef.getOrders()){
                //iterating through dishes
                int orderPreparationTime = 0;
                for(Dish dish : order.getOrderData().getDishes()){
                    //counting whole dish preparation time
                    orderPreparationTime += dish.getPreparationTime();
                }
                //adding dish preparation time to all chefs dishes preparation time
                sum =+ orderPreparationTime;
            }
            if(sum <= min){
                min = sum;
                soonestAvailableChef = chef;
            }
        }
        return soonestAvailableChef;
    }
}
