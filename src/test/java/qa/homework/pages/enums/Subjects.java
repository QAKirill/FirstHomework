package qa.homework.pages.enums;

public enum Subjects {
    Hindi("Hindi"),
    English("English"),
    Maths("Maths"),
    Physics("Physics"),
    Chemistry("Chemistry"),
    Biology("Biology"),
    ComputerScience("Computer Science"),
    Commerce("Commerce"),
    Accounting("Accounting"),
    Economics("Economics"),
    Arts("Arts"),
    SocialStudies("Social Studies"),
    History("History"),
    Civics("Civics");

    private final String value;

    Subjects(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}