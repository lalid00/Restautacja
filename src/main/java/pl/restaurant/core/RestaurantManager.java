package pl.restaurant.core;

import pl.restaurant.client.OrderConsoleReader;
import pl.restaurant.client.RestaurantConsoleReader;
import pl.restaurant.core.calculations.TableAssigningCalculator;
import pl.restaurant.core.model.Kitchen;
import pl.restaurant.core.model.Order;
import pl.restaurant.core.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    public static Restaurant run(){
        return RestaurantConsoleReader.read();
    }


}
