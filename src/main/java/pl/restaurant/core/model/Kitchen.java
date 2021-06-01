package pl.restaurant.core.model;

import java.util.ArrayList;

public class Kitchen {
    private final int numOfChefs;
    private final ArrayList<Chef> chefs;

    public Kitchen(int numOfChefs) {
        this.numOfChefs = numOfChefs;
        this.chefs = new ArrayList<>();
        int count = 0;
        while(count < numOfChefs){
            String name = Names.values()[(int) (Math.random() * Names.values().length)].getName();
            this.chefs.add(new Chef(new PersonalData(name),null));
            count++;
        }
    }

    public int getNumOfChefs() {
        return numOfChefs;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "numOfChefs=" + numOfChefs +
                ", chefs=" + chefs +
                '}';
    }
}
