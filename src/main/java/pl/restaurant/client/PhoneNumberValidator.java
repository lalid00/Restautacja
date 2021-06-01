package pl.restaurant.client;

import pl.restaurant.core.Constants;

import java.util.Scanner;

public class PhoneNumberValidator {
    public static boolean validate(String input){
        return input.matches(Constants.PHONE_REGEX);
    }
}
