package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;


public class TestBase {

    public static String deviceHost = System.getProperty("mobile");

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 15000;
        if (deviceHost.equals("browserstack")) {
            Configuration.browser = BrowserstackMobileDriver.class.getName();
        } else {
            Configuration.browser = LocalMobileDriver.class.getName();
        }
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        Attach.pageSource();
        if ("browserstack".equals(deviceHost)) {
            Attach.addVideo(sessionId().toString());
        }
        closeWebDriver();
    }

}
