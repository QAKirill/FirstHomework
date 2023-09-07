package qa.homework.enums;

public enum Subjects {
    HINDI("Hindi"),
    ENGLISH("English"),
    MATHS("Maths"),
    PHYSICS("Physics"),
    CHEMISTRY("Chemistry"),
    BIOLOGY("Biology"),
    COMPUTERSCIENCE("Computer Science"),
    COMMERCE("Commerce"),
    ACCOUNTING("Accounting"),
    ECONOMICS("Economics"),
    ARTS("Arts"),
    SOCIALSTUDIES("Social Studies"),
    HISTORY("History"),
    CIVICS("Civics");

    private final String value;

    Subjects(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}