package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$$x;

public class VideoPage {

    private WebDriverRunner driver;

    public VideoPage(WebDriverRunner driver) {
        this.driver = driver;
    }

    public void verify(String contentContainerNumber) {
        $$x("(//div[@class='ui-row-content d-flex transition'])[" + contentContainerNumber + "]/a").shouldHave(CollectionCondition.size(10));
    }
}
