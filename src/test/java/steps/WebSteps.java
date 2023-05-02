package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    private WebDriverRunner driver;

    public WebSteps(WebDriverRunner driver) {
        this.driver = driver;
    }

    HomePage homePage = new HomePage(new WebDriverRunner());


    // todo здесь также другие пэйджи

    @Step("Перейти на сайт")
    public void goToHomePage() {
        open(baseUrl);
    }

    @Step("Проверить верхнее меню на количество разделов")
    public void verifyHeaderMenuTabs() {
        homePage.verify_header_tabs_amount();
    }

    @Step("Проверить первый блок называется 'Популярно сейчас'")
    public void verifyFirstContentContainerName() {
        homePage.verify_container_name();
    }

    @Step("Проверить что у каждого блока есть опция 'Смотреть все'")
    public void verifyAllContentContainersHasOptionToExpand() {
        int contentContainersSize = homePage.get_content_containers_size();
        int expandOptionSize = homePage.get_expand_option_size();
        Assertions.assertEquals(contentContainersSize - 1, expandOptionSize);
    }

    @Step("Проверить на домашней странице есть блок с конкретным текстом")
    public void checkContainerByName(String containerName) {
        homePage.verify_container_by_name(containerName);
    }
}
