package pl.restaurant.client;

public class StringValidator {
    public static boolean validate(String input, String regex){
        return !input.matches(regex);
    }
}
