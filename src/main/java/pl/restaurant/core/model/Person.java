package pl.restaurant.core.model;

public abstract class Person {
    private final PersonalData personalData;
    private final ContactData contactData;


    protected Person(PersonalData personalData, ContactData contactData) {
        this.personalData = personalData;
        this.contactData = contactData;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public ContactData getContactData() {
        return contactData;
    }
}
