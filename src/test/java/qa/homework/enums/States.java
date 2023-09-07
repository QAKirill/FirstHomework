package qa.homework.enums;

public enum States {
    NCR("NCR"),
    UTTARPRADESH("Uttar Pradesh"),
    HARYANA("Haryana"),
    RAJASTHAN("Rajasthan");

    private final String value;

    States(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}