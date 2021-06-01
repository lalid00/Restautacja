package pl.restaurant.core.model;

public class Client extends Person {
    private final boolean loyaltyCard;

    public Client(PersonalData personalData, ContactData contactData, boolean loyaltyCard) {
        super(personalData, contactData);
        this.loyaltyCard = loyaltyCard;
    }

    public boolean hasLoyaltyCard() {
        return loyaltyCard;
    }
    public static class Builder{
        private PersonalData personalData;
        private ContactData contactData;
        private boolean loyaltyCard;

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

        public Builder withLoyaltyCard(boolean loyaltyCard){
            this.loyaltyCard = loyaltyCard;
            return this;
        }

        public Client build(){
            return new Client(personalData,contactData,loyaltyCard);
        }
    }

    @Override
    public String toString() {
        return "Client's name: " + getPersonalData().getName() + ", id: " + getPersonalData().getId() ;
    }
}
