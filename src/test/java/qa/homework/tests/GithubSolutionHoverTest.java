package qa.homework.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubSolutionHoverTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void hoverTest() {
        open("/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".header-menu-wrapper").$(byText("Enterprise")).click();
        $(".application-main ").$("h1").shouldHave(text("Build like the best"));
    }
}
