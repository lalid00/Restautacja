package pl.restaurant.client;

import pl.restaurant.core.Constants;

public class EmailValidator {
    public static boolean validate(String input){
        if(input.matches(Constants.EMAIL_REGEX)){
            return true;
        }
        return false;
    }
}
