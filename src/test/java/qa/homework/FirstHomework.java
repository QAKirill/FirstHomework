package qa.homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static qa.homework.PageObject.*;

public class FirstHomework {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $(firstName).setValue("Kirill");
        $(lastName).setValue("Ivanov");
        $(userEmail).setValue("my@mail.ru");
        $(byText(genderRadio)).click();
        $(userNumber).setValue("1555232325");
        $(dateOfBirth).click();
        $(new By.ByClassName(monthSelect)).click();
        $(byText("August")).click();
        $(new By.ByClassName(yearSelect)).click();
        $(byText("1992")).click();
        $(byText("18")).click();
        $(subjectsContainer).setValue("English").pressEnter();
        $(byText("English")).click();
        $(byText(hobbiesCheckbox)).click();
        $(uploadPicture).uploadFromClasspath("128.png");
        $(currentAddress).setValue("Lenina 1");
        $(selectState).click();
        $(byText("NCR")).click();
        $(selectCity).click();
        $(byText("Gurgaon")).click();

        $(submitButton).click();

        $(new By.ByClassName("table-responsive")).shouldHave(text("Kirill Ivanov"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("my@mail.ru"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("1555232325"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("18 August,1992"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("English"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("Music"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("128.png"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("Lenina 1"));
        $(new By.ByClassName("table-responsive")).shouldHave(text("NCR Gurgaon"));
    }
}
