package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.WebDriverRunner;
import tests.web.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

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
}
