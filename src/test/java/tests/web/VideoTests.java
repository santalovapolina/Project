package tests.web;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class VideoTests extends TestBase {

    private WebSteps steps = new WebSteps(new WebDriverRunner());

    @Test
    public void test1() {
        steps.goToVideoPage();
        steps.verifyContainerContentSize("2"); // there are 33 to choose
    }



}
