package pl.restaurant.client;

import pl.restaurant.core.model.Dish;
import pl.restaurant.core.model.Tables;

public class EnumValidator {
    public static boolean validateTable(String input) {
        int tableNumber = Integer.parseInt(input);
        for (Tables table : Tables.values()) {
            if (table.getNumber() == tableNumber) {
                return true;
            }
        }
        return false;
    }

    public static boolean validateDish(String input) {
        for (Dish dish : Dish.values()) {
            if (dish.name().matches(input)) {
                return true;
            }
        }
        return false;


    }
}
