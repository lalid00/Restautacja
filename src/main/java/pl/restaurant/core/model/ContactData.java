package pl.restaurant.core.model;

public class ContactData {
    private final String phoneNumber;
    private final String email;

    public ContactData(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static class Builder{
        private String phoneNumber;
        private String email;

        private Builder(){}

        public static Builder create(){
            return new Builder();
        }

        public Builder withPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public ContactData build(){
            return new ContactData(phoneNumber,email);
        }
    }
}
