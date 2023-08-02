package qa.homework;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void replaceAB() {
        open("/drag_and_drop");

        $("#column-a header").shouldHave(text("A"));
        $("#column-b header").shouldHave(text("B"));
        //$("#column-a").dragAndDropTo($("#column-b")); //deprecated
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
        //работает
    }

    @Test
    void replaceABusingActions() {
        open("/drag_and_drop");

        actions().dragAndDrop($("column-a"), $("column-b"));
        //тоже работает
    }
}
