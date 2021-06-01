package pl.restaurant.core.model;

import java.util.ArrayList;
import java.util.List;

public class OrderData {
    private Tables tableNumber;
    private final int numOfPeople;
    private final int numOfDishes;
    private final List<Dish> dishes;

    public OrderData( int numOfPeople, List<Dish> dishes) {
        this.tableNumber = tableNumber;
        this.numOfPeople = numOfPeople;
        this.numOfDishes = dishes.size();
        this.dishes = dishes;
    }

    public Tables getTableNumber() {
        return tableNumber;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public int getNumOdDishes() {
        return numOfDishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setTableNumber(Tables tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString() {
        return "OrderData{" +
                "tableNumber=" + tableNumber +
                ", numOfPeople=" + numOfPeople +
                ", numOdDishes=" + numOfDishes +
                ", dishes=" + dishes +
                '}';
    }

    public static class Builder{
        private int tableNumber;
        private int numOfPeople;
        private int numOfDishes;
        private List<Dish> dishes;

        private Builder() {}

        public static Builder create(){
            return new Builder();
        }

        public Builder withTableNumber(int tableNumber){
            this.tableNumber = tableNumber;
            return this;
        }

        public Builder withNumOfPeople(int numOfPeople){
            this.numOfPeople = numOfPeople;
            return this;
        }

        public Builder withNumOfDishes(int numOfDishes){
            this.numOfDishes = numOfDishes;
            return this;
        }

        public Builder withDishes(List<Dish> dishes){
            this.dishes = dishes;
            return this;
        }

        public OrderData build(){
            return new OrderData(numOfPeople,dishes);
        }

    }


}
