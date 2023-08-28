package tests.mobile;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.MobileSteps;

import static com.codeborne.selenide.Selenide.sleep;

@Tag("mobile")
@Owner("Santalova Polina")
public class MobileTests extends TestBase{

    MobileSteps steps = new MobileSteps(new WebDriverRunner());

    @BeforeEach
    void passStartingPage() {
        steps.skipAuth();
        steps.acceptSharingLocation();
    }

    @Test
    void checkHomePageFilters() {
        steps.verifyFiltersOnHeaderMenu();
    }

    @Test
    void checkTvHeaderTabs() {
        steps.goToTvFromBottomNavTab();
        steps.verifyHeaderTabs();
    }






}
