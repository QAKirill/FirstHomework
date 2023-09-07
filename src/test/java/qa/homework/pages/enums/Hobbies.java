package qa.homework.pages.enums;

public enum Hobbies {
    SPORTS("Sports"),
    READING("Reading"),
    MUSIC("Music");

    private final String value;

    Hobbies(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}