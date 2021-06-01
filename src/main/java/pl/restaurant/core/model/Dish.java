package pl.restaurant.core.model;

public enum Dish {
    PIEROGI(15,10),
    PIZZA(20,19),
    KANAPKA(5,8),
    ZUPA(3,10),
    MAKARON(15,13),
    SCHABOWY(20,22),
    PULPETY(20,17),
    KACZKA(30,31),
    STEK(30,55);


    private int preparationTimeInMin;
    private int price;

    Dish(int preparationTimeInMin, int price) {
        this.preparationTimeInMin = preparationTimeInMin;
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTimeInMin;
    }

    public int getPrice() {
        return price;
    }
}
