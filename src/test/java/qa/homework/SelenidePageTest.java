package qa.homework;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@ExtendWith({SoftAssertsExtension.class})
public class SelenidePageTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/selenide";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void findJUnit5inSoftAssertions(){
        Configuration.assertionMode = SOFT;
        open("/selenide");

        $("#wiki-tab").click();
        $("#wiki-body").$(byText("Soft assertions")).should(Condition.visible).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}