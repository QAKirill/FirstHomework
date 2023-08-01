package qa.homework;

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
        $("#wiki-pages-box button").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
        $("#wiki-body").shouldHave(text(
                "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}\n" +
                "Or register extension inside test class:\n" +
                "\n" +
                "class Tests {\n" +
                "  @RegisterExtension \n" +
                "  static SoftAssertsExtension softAsserts = new SoftAssertsExtension();\n" +
                "\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}\n" +
                "You can use the old good dependency \"com.codeborne:selenide\" because it contains JUnit5-specific classes."));
    }
}