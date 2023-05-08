package pages;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class TvPage {
    private WebDriverRunner driver;

    public TvPage(WebDriverRunner driver) {
        this.driver = driver;
    }

    public void verify_tabs_on_header_menu() {
        $(accessibilityId("Телеканалы")).should(exist);
        $(accessibilityId("Телепередачи")).should(exist);
    }
}
