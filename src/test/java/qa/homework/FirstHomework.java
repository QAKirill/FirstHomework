package qa.homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.awt.*;

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
    void fillFormTest() throws AWTException {
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
        $(new By.ByClassName(subjectsContainer)).click();

        Robot robot = new Robot();
        robot.keyPress(69);

        $(byText("English")).click();
        $(byText(hobbiesCheckbox)).click();
        $(uploadPicture).uploadFromClasspath("128.png");
        $(currentAddress).setValue("Ленина 1");
        $(selectState).click();
        $(byText("NCR")).click();
        $(selectCity).click();
        $(byText("Gurgaon")).click();
        $(submitButton).click();
    }
}
