package pl.restaurant.core.calculations;

import pl.restaurant.core.model.Dish;
import pl.restaurant.core.model.Order;

import java.util.List;

public class MaxTimeInOrderCalculation {

    public static int calculate(Order order){
        List<Dish> dishes = order.getOrderData().getDishes();
        int max = 0;
        for(Dish dish : dishes){
            if(max < dish.getPreparationTime()){
                max = dish.getPreparationTime();
            }
        }
        return max;
    }
}
