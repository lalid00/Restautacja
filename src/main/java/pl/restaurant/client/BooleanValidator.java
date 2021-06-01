package pl.restaurant.client;

public class BooleanValidator {
    public static boolean validateLoyaltyCard(String input){
        if(input.equalsIgnoreCase("yes")){
            return true;
        } else if(input.equalsIgnoreCase("no")){
            return true;
        }
        return false;
    }
}
