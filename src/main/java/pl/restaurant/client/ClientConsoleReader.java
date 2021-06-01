package pl.restaurant.client;

import pl.restaurant.core.Constants;
import pl.restaurant.core.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientConsoleReader {

    public Client read(){
        Scanner in = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();


        boolean loyaltyCard = doesLoyaltyCardExists(in);

        String name = getName(in);
        String phoneNumber = getPhoneNumber(in);
        String email = getEmail(in);

        return new Client(
                PersonalData.Builder
                        .create()
                        .withName(name)
                        .build(),
                ContactData.Builder
                        .create()
                        .withEmail(email)
                        .withPhoneNumber(phoneNumber)
                        .build(),
                loyaltyCard);
    }
    private String getName(Scanner in){
        String input;
        //validating if name is written correctly
        do{
            System.out.println("What is your name?");
            input = in.next();
        } while (!StringValidator.validate(input, Constants.NAME_REGEX));
        return input;
    }

    private String getPhoneNumber(Scanner in){
        String input;
        //validating if phone number is correct
        do{
            System.out.println("What is your phone number?");
            input = in.next();
        } while (!PhoneNumberValidator.validate(input));
        return input;
    }

    private String getEmail(Scanner in){
        String input;
        //validating if email is correct
        do{
            System.out.println("What is your Email?");
            input = in.next();
        } while (!EmailValidator.validate(input));
        return input;
    }

    private boolean doesLoyaltyCardExists(Scanner in){
        String input;
        //validating if loyalty card exists
        do{
            System.out.println("Do you have a loyalty card?");
            input = in.next();
        } while (!BooleanValidator.validateLoyaltyCard(input));
        if(input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

}
