package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$$x;

public class VideoPage {

    private WebDriverRunner driver;

    int containerNumber = new Faker().number().numberBetween(1, 40);

    private final ElementsCollection videos = $$x("(//div[@class='ui-row-content d-flex transition'])["+ containerNumber +"]/a");

    public VideoPage(WebDriverRunner driver) {
        this.driver = driver;
    }

    public void verify_items_size() {
        videos.shouldHave(CollectionCondition.size(10));

    }
}
