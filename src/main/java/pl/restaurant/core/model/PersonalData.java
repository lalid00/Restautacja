package pl.restaurant.core.model;

import java.util.UUID;

public class PersonalData {
    private final String name;
    private final UUID id;


    public PersonalData(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }
    public PersonalData() {
        this.name = Names.values()[(int) (Math.random() * Names.values().length)].getName();
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    public static class Builder{
        private String name;
        private UUID id;

        private Builder(){}

        public static Builder create(){
            return new Builder();
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withId(UUID id){
            this.id = id;
            return this;
        }

        public PersonalData build(){
            return new PersonalData(name);
        }

    }
}
