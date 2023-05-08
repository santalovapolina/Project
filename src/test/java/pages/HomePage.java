package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.WebDriverRunner;
import tests.web.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;

public class HomePage extends TestBase {

    private WebDriverRunner driver;

    public HomePage(WebDriverRunner driver) {
        this.driver = driver;
    }

    public void verify_header_tabs_amount() {
        $$x("//nav[@class='col d-flex']/a").shouldHave(CollectionCondition.size(4));
    }

    public void verify_container_name() {
        $x("(//div[@class='ui-row-title-container'])[1]/h2").shouldHave(text("Популярно сейчас"));
    }


    public void verify_container_by_name(String containerName) {
        $$x("//div[@class='ui-row-title-container']/h2").findBy(text(containerName)).should(visible);
    }

    public void verify_filters_on_header() {
        $(id("ru.mts.mtstv:id/menuActionFilter")).shouldBe(visible);
    }

    public void click_on_tv_tab() {
        $(id("ru.mts.mtstv:id/tabNavTvAction")).click();
    }
}
