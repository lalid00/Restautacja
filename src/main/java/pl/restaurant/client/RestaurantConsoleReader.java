package pl.restaurant.client;

import pl.restaurant.core.Constants;
import pl.restaurant.core.OrdersManager;
import pl.restaurant.core.calculations.PriceCalculator;
import pl.restaurant.core.calculations.TableAssigningCalculator;
import pl.restaurant.core.model.Kitchen;
import pl.restaurant.core.model.Order;
import pl.restaurant.core.model.Restaurant;
import pl.restaurant.core.model.Tables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantConsoleReader {

    public static Restaurant read(){
        Scanner in = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();
        Kitchen kitchen = getKitchen(in);
        Restaurant restaurant = new Restaurant(kitchen, orders);

        String start;
        do {
            start = start(in);
            if (start.equalsIgnoreCase("A")) {
                int numOfPeople = getNumberOfPeople(in);
                if(TableAssigningCalculator.calculate(restaurant, numOfPeople)) {
                    OrderConsoleReader orderConsoleReader = new OrderConsoleReader();
                    Order newOrder = orderConsoleReader.read(numOfPeople);

                    TableAssigningCalculator.calculate(restaurant, newOrder);
                    System.out.println("Your table's number is " + newOrder.getOrderData().getTableNumber().getNumber());

                    OrdersManager.assignChef(restaurant.getKitchen(),newOrder);
                    restaurant.getOrders().add(newOrder);
                }
            } else if (start.equalsIgnoreCase("B")){
                System.out.println(restaurant.getTakenTables());
                int tableNumber = getCheckTableNumber(in);
                Tables table = Tables.getTablesByNumber(tableNumber);
                if(restaurant.getTakenTables().contains(table)){
                    restaurant.getAvailableTables().add(table);
                    restaurant.getTakenTables().remove(table);
                    double price = PriceCalculator.calculate(restaurant.getOrderByTable(tableNumber));
                    System.out.println("Total for table number " + tableNumber + " is " + price + "$");
                } else {
                    System.out.println("That table is not taken");
                }
            }
        } while(!start.equalsIgnoreCase("C"));

        System.out.println("Thank you for the day, goodnight.");
        System.out.println(restaurant);
        return restaurant;
    }

    private static Kitchen getKitchen(Scanner in){
        String input;
        //validating if input is an integer between proper numbers
        do{
            System.out.println("How many chefs are working today? [1-4]");
            input = in.next();
        }while (!NumberValidator.validateInteger(input,1,4));
        return new Kitchen(Integer.parseInt(input));
    }

    private static String start(Scanner in){
        String input;
        do{
            System.out.println("What would you like to do?\n" +
                    "A. Add new Order\n" +
                    "B. Take a check\n" +
                    "C. Close the system");
            input = in.next();
        } while (StringValidator.validate(input.toUpperCase(), Constants.LETTER_REGEX));
        return input.toUpperCase();
    }
    private static int getNumberOfPeople(Scanner in){
        String input;
        //validating if number is an integer between proper number of people
        do{
            System.out.println("How many sits do you need?");
            input = in.next();
        } while(!NumberValidator.validateInteger(input,1,5));
        //returning person per table
        return Integer.parseInt(input);
    }

    private static int getCheckTableNumber(Scanner in){
        String input;
        //validating if number is actual table number
        do{
            System.out.println("Which table's check do you want to print?");
            input = in.next();
        } while(!NumberValidator.validateInteger(input,1, Tables.values().length));
        return Integer.parseInt(input);
    }
}
