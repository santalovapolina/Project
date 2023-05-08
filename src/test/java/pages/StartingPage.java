package pages;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class StartingPage {
    private WebDriverRunner driver;

    public StartingPage(WebDriverRunner driver) {
        this.driver = driver;
    }
    public void skip_auth() {
        $(id("ru.mts.mtstv:id/skipBtn")).click();
    }

    public void accept_sharing_location() {
        $(id("ru.mts.mtstv:id/bottomAccept")).click();
        $(id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
    }
}
