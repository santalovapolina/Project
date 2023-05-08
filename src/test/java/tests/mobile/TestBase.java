package tests.mobile;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = LocalMobileDriver.class.getName();
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 15000;
        Configuration.browserSize = null;

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        Attach.pageSource();
        closeWebDriver();
    }

}
