package pl.restaurant.core.calculations;

import pl.restaurant.core.model.Dish;
import pl.restaurant.core.model.Order;

public class PriceCalculator {

    public static double calculate(Order order){
        double sum = 0;
        for(Dish dish : order.getOrderData().getDishes()){
            sum += dish.getPrice();
        }
        if(order.getClient().hasLoyaltyCard()){
            sum *= 0.9;
        }
        return sum;
    }
}
