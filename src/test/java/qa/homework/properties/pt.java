package qa.homework.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class pt {

    @Test
    @Tag("prop")
    void name() {
        String browser = System.getProperty("browser", "Edge");
        System.out.println(browser);
    }
}
