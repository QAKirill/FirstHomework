package qa.homework.enums.cities;

public enum CitiesHaryana {
    KARNAL("Karnal"),
    PANIPAT("Panipat");

    private final String value;

    CitiesHaryana(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}