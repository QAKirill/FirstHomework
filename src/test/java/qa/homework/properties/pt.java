package qa.homework.properties;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class pt {

    @Test
    @Tag("prop")
    void name() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        String browser = System.getProperty("browser", "Edge");

        step("Выводим:", () ->
        System.out.println(browser));
        Allure.addAttachment("Browser = ", browser);
    }
}
