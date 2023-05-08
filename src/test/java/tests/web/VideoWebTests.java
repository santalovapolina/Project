package tests.web;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class VideoWebTests extends TestBase {

    private WebSteps steps = new WebSteps(new WebDriverRunner());

    @Test
    public void checkContentContainerItemsSizeByIndex() {
        steps.goToVideoPage();
        steps.verifyContainerContentItemsSize("2");
    }



}
