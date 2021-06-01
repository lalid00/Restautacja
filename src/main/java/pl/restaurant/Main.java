package pl.restaurant;

import pl.restaurant.client.OrderConsoleReader;
import pl.restaurant.client.ClientConsoleReader;
import pl.restaurant.client.RestaurantConsoleReader;
import pl.restaurant.core.Constants;
import pl.restaurant.core.RestaurantManager;
import pl.restaurant.core.calculations.TableAssigningCalculator;
import pl.restaurant.core.model.*;

import java.util.*;

public class Main {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone(Constants.DEFAULT_SYSTEM_ZONE_ID));
        Locale.setDefault(Constants.DEFAULT_LOCALE);
    }
    public static void main(String[] args) {

       Kitchen kitchen = new Kitchen(2);
        System.out.println();

        OrderConsoleReader consoleReader = new OrderConsoleReader();
        ClientConsoleReader clientConsoleReader = new ClientConsoleReader();
        RestaurantConsoleReader restaurantConsoleReader = new RestaurantConsoleReader();
        //consoleReader.read();
        //restaurantConsoleReader.read();
        //restaurantConsoleReader.read();

        RestaurantManager.run();
    }
}
