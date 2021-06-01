package pl.restaurant.core.model;

public enum Tables {
    ONE(1,4),
    TWO(2,4),
    THREE(3,2),
    FOUR(4,2),
    FIVE(5,3),
    SIX(6,2),
    SEVEN(7,3),
    EIGHT(8,4),
    NINE(9,4),
    TEN(10,3);

    private final int number;
    private final int sits;

    Tables(int number, int sits){
        this.number = number;
        this.sits = sits;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "number=" + number +
                ", sits=" + sits +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public int getSits() {
        return sits;
    }

    public static Tables getTablesByNumber(int tableNumber){
        for(Tables table : Tables.values()){
            if (table.number == tableNumber) {
                return table;
            }
        }
        return null;
    }
}

