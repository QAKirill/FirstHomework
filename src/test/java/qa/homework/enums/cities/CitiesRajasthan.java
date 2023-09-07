package qa.homework.enums.cities;

public enum CitiesRajasthan {
    JAIPUR("Jaipur"),
    JAISELMER("Jaiselmer");

    private final String value;

    CitiesRajasthan(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}