package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import pages.HomePage;
import pages.VideoPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static tests.web.TestBase.endHome;
import static tests.web.TestBase.endVideo;

public class WebSteps {

    private WebDriverRunner driver;

    public WebSteps(WebDriverRunner driver) {
        this.driver = driver;
    }

    HomePage homePage = new HomePage(new WebDriverRunner());

    VideoPage videoPage = new VideoPage(new WebDriverRunner());


    @Step("Go to home page")
    public void goToHomePage() {
        open(baseUrl + endHome);
    }

    @Step("Verify header menu tabs amount")
    public void verifyHeaderMenuTabs() {
        homePage.verify_header_tabs_amount();
    }

    @Step("Verify container name 'Популярно сейчас'")
    public void verifyFirstContentContainerName() {
        homePage.verify_container_name();
    }

    @Step("Verify home page container")
    public void checkContainerByName(String containerName) {
        homePage.verify_container_by_name(containerName);
    }

    @Step("Go to video page")
    public void goToVideoPage() {
        open(baseUrl + endVideo);
    }

    @Step("Verify container content items size")
    public void verifyContainerContentItemsSize(String contentContainerNumber) {
        videoPage.verify_items_size(contentContainerNumber);
    }
}
