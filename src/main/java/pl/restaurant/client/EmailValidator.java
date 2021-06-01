package pl.restaurant.client;

import pl.restaurant.core.Constants;

public class EmailValidator {
    public static boolean validate(String input){
        return input.matches(Constants.EMAIL_REGEX);
    }
}
