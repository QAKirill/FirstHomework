package qa.homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static qa.homework.PageObject.*;

public class StudentRegistrationFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $(firstName).setValue("Kirill");
        $(lastName).setValue("Ivanov");
        $(userEmail).setValue("my@mail.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $(userNumber).setValue("1555232325");
        $(dateOfBirth).click();
        $(new By.ByClassName(monthSelect)).selectOption("August");
        $(new By.ByClassName(yearSelect)).selectOption("1992");
        $(new By.ByXPath("//*[@class='react-datepicker__day react-datepicker__day--018']")).click();
        $(subjectsContainer).setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $(uploadPicture).uploadFromClasspath("128.png");
        $(currentAddress).setValue("Lenina 1");
        $(selectState).click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $(selectCity).click();
        $("#stateCity-wrapper").$(byText("Gurgaon")).click();

        $(submitButton).click();

        $(".modal-content").should(appear);
        $(".table-responsive").$(byText("Student Name"))
                .parent().shouldHave(text("Kirill Ivanov"));
        $(".table-responsive").$(byText("Student Email"))
                .parent().shouldHave(text("my@mail.ru"));
        $(".table-responsive").$(byText("Gender"))
                .parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile"))
                .parent().shouldHave(text("1555232325"));
        $(".table-responsive").$(byText("Date of Birth"))
                .parent().shouldHave(text("18 August,1992"));
        $(".table-responsive").$(byText("Subjects"))
                .parent().shouldHave(text("English"));
        $(".table-responsive").$(byText("Hobbies"))
                .parent().shouldHave(text("Music"));
        $(".table-responsive").$(byText("Picture"))
                .parent().shouldHave(text("128.png"));
        $(".table-responsive").$(byText("Address"))
                .parent().shouldHave(text("Lenina 1"));
        $(".table-responsive").$(byText("State and City"))
                .parent().shouldHave(text("NCR Gurgaon"));
    }
}
