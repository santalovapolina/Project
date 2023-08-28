package pages;


import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.appium.java_client.AppiumBy.id;

public class StartingPage {
    private WebDriverRunner driver;

    private final By skipBtn = id("ru.mts.mtstv:id/skipBtn"),
            subscriptionsCompletePurchaseControls = id("ru.mts.mtstv:id/subscriptionsCompletePurchaseControls"),
            acceptBtn = id("ru.mts.mtstv:id/bottomAccept"),
            allowForgrndPermissionBtn = id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"),
            allowPermissionBtn = id("com.android.packageinstaller:id/permission_allow_button");


    public StartingPage(WebDriverRunner driver) {
        this.driver = driver;
    }

    public void skip_auth() {
        sleep(1000);
        if ($(skipBtn).exists()) {
            $(skipBtn).click();
        }
        sleep(1000);
        if ($(subscriptionsCompletePurchaseControls).exists()) {
            $(subscriptionsCompletePurchaseControls).click();
        }
    }

    public void accept_sharing_location() {
        sleep(1000);
        if ($(acceptBtn).exists()) {
            $(acceptBtn).click();
        }
        sleep(1000);
        if ($(allowForgrndPermissionBtn).exists()) {
            $(allowForgrndPermissionBtn).click();
        } else {
            $(allowPermissionBtn).click();
        }

    }
}
