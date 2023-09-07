package qa.homework.pages.enums;

public enum States {
    Ncr("NCR"),
    UttarPradesh("Uttar Pradesh"),
    Haryana("Haryana"),
    Rajasthan("Rajasthan");

    private final String value;

    States(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}