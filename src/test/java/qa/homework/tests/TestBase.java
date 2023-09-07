package qa.homework.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import qa.homework.utils.TestData;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

        TestData data = new TestData(1900, 2100); //Генерируем случайные тестовые данные перед выполнением всех тестов
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }
}