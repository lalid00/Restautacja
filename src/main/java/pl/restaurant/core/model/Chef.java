package pl.restaurant.core.model;

import java.util.ArrayList;

public class Chef extends Person{
    private final ArrayList<Order> orders;

    public Chef(PersonalData personalData, ContactData contactData) {
        super(personalData, contactData);
        this.orders = new ArrayList<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return this.getPersonalData().getName();
    }

    public static class Builder{
        private PersonalData personalData;
        private ContactData contactData;

        private Builder(){}

        public static Builder create(){
            return new Builder();
        }

        public Builder withPersonalData(PersonalData personalData){
            this.personalData = personalData;
            return this;
        }

        public Builder withContactData(ContactData contactData){
            this.contactData = contactData;
            return this;
        }

        public Chef build(){
            return new Chef(personalData,contactData);
        }


    }
}
