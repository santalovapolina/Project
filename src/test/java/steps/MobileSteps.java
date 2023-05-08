package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import pages.HomePage;
import pages.StartingPage;
import pages.TvPage;


public class MobileSteps {

    private WebDriverRunner driver;

    public MobileSteps(WebDriverRunner driver) {
        this.driver = driver;
    }

    StartingPage startingPage = new StartingPage(new WebDriverRunner());

    HomePage homePage = new HomePage(new WebDriverRunner());

    TvPage tvPage = new TvPage(new WebDriverRunner());

    @Step("Skip authorization")
    public void skipAuth() {
        startingPage.skip_auth();
    }

    @Step("Accept sharing location with app")
    public void acceptSharingLocation() {
        startingPage.accept_sharing_location();
    }

    @Step("Verify filters option on header menu")
    public void verifyFiltersOnHeaderMenu() {
        homePage.verify_filters_on_header();
    }

    @Step("Switch to TV page from bottom navigation menu on home page")
    public void goToTvFromBottomNavTab() {
        homePage.click_on_tv_tab();
    }

    @Step("Verify header menu tabs on TV page")
    public void verifyHeaderTabs() {
        tvPage.verify_tabs_on_header_menu();
    }
}
