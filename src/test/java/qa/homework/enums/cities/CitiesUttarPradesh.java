package qa.homework.enums.cities;

public enum CitiesUttarPradesh {
    AGRA("Agra"),
    LUCKNOW("Lucknow"),
    MERRUT("Merrut");

    private final String value;

    CitiesUttarPradesh(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}