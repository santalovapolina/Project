package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import tests.web.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static io.appium.java_client.AppiumBy.id;

public class HomePage extends TestBase {

    private WebDriverRunner driver;

    public HomePage(WebDriverRunner driver) {
        this.driver = driver;
    }

    private final String firstContainerName = "Популярно сейчас";

    private final By menuActionFilter = id("ru.mts.mtstv:id/menuActionFilter"),
            tabNavTvAction = id("ru.mts.mtstv:id/tabNavTvAction");

    private final ElementsCollection headerTabs = $$x("//nav[@class='col d-flex']/a"),
            containersTitles = $$x("//div[@class='ui-row-title-container']/h2");


    public void verify_header_tabs_amount() {
        headerTabs.shouldHave(CollectionCondition.size(4));
    }

    public void verify_container_name() {
        containersTitles.get(0).shouldHave(text(firstContainerName));
    }

    public void verify_container_by_name(String containerName) {
        containersTitles.findBy(text(containerName)).should(visible);
    }

    public void verify_filters_on_header() {
        $(menuActionFilter).shouldBe(visible);
    }

    public void click_on_tv_tab() {
        $(tabNavTvAction).click();
    }
}
