package pl.restaurant.client;

import pl.restaurant.core.Constants;

import java.util.Scanner;

public class NumberValidator {

    public static boolean validateInteger(String input, int min, int max){
        if(input.matches(Constants.INTEGER_REGEX)){
            int value = Integer.valueOf(input);
            if(value >= min && value <= max){
                return true;
            }
        }
        return false;
    }
}
