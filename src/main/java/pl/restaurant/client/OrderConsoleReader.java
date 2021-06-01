package pl.restaurant.client;

import pl.restaurant.core.Constants;
import pl.restaurant.core.OrdersManager;
import pl.restaurant.core.calculations.MaxTimeInOrderCalculation;
import pl.restaurant.core.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderConsoleReader {

    public Order read(int numOfPeople){
        Scanner in = new Scanner(System.in);

        ClientConsoleReader clientConsoleReader = new ClientConsoleReader();
        Client newClient = clientConsoleReader.read();

        List<Dish> dishes = getDishes(in);

        //creating new order via builder class
        return new Order(newClient,
                OrderData.Builder
                .create()
                .withNumOfPeople(numOfPeople)
                .withDishes(dishes)
                .build());
    }



    private List<Dish> getDishes(Scanner in) {
        String input;
        List<Dish> dishesInOrder = new ArrayList<>();
        int preparationTime;
        //validating if dish is on the menu
        do {
            do {
                System.out.println("What would you like to eat?");
                input = in.next();
            } while (!EnumValidator.validateDish(input.toUpperCase()));
            //adding dish to an order
            dishesInOrder.add(Dish.valueOf(input.toUpperCase()));
            //Asking if there is another dish to order
            System.out.println("Anything else?");
            //getting answer
            input = in.next();
        } while (!input.equalsIgnoreCase("no"));


        //calculating time to give away the order
        preparationTime = MaxTimeInOrderCalculation.calculate(new Order(null, new OrderData(0,dishesInOrder)));
        System.out.println("Your order will be ready in " + preparationTime + " minutes. Thank you and I hope you'll enjoy your evening. ");
        //saving order
        return dishesInOrder;
    }

}
