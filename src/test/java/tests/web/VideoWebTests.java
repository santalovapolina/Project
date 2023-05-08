package tests.web;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

@Tag("ui")
@Owner("Santalova Polina")
public class VideoWebTests extends TestBase {

    private WebSteps steps = new WebSteps(new WebDriverRunner());

    @Test
    public void checkContentContainerItemsSizeByIndex() {
        steps.goToVideoPage();
        steps.verifyContainerContentItemsSize("2");
    }



}
