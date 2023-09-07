package qa.homework.enums.cities;

public enum CitiesNCR {
    DELHI("Delhi"),
    GURGAON("Gurgaon"),
    NOIDA("Noida");

    private final String value;

    CitiesNCR(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}