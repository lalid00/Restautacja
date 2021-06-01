package pl.restaurant.core.model;

public enum Names {
    JOHN("John"),
    MARK("Mark"),
    JACK("Jack"),
    AHMED("Ahmed"),
    KRZYSZTOF("Krzysztof"),
    HANS("Hans"),
    ALBERT("Albert"),
    JOSE("Jose"),
    ANNE("Anne"),
    JULIA("Julia"),
    MONICA("Monica"),
    JANA("Jana"),
    BEATRICE("Beatrice");

    private final String name;

    Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
