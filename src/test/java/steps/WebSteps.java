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


    // todo здесь также другие пэйджи

    @Step("Перейти на домашнюю страницу")
    public void goToHomePage() {
        open(baseUrl + endHome);
    }

    @Step("Проверить верхнее меню на количество разделов")
    public void verifyHeaderMenuTabs() {
        homePage.verify_header_tabs_amount();
    }

    @Step("Проверить первый блок называется 'Популярно сейчас'")
    public void verifyFirstContentContainerName() {
        homePage.verify_container_name();
    }



    @Step("Проверить на домашней странице есть блок с конкретным текстом")
    public void checkContainerByName(String containerName) {
        homePage.verify_container_by_name(containerName);
    }

    @Step("Перейти на страницу 'Фильмы'")
    public void goToVideoPage() {
        open(baseUrl + endVideo);
    }

    @Step("Проверить что на странице с фильмами в слайдере 10 фильмов")
    public void verifyContainerContentItemsSize(String contentContainerNumber) {
        videoPage.verify_items_size(contentContainerNumber); // todo change the name of method
    }
}
