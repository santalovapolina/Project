package tests.web;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class HomeWebTests extends TestBase {

    private WebSteps steps = new WebSteps(new WebDriverRunner());

    @Test
    public void checkHeaderMenuTabs() {
        steps.goToHomePage();
        steps.verifyHeaderMenuTabs();
    }

    @Test
    public void checkFirstContentContainerName() {
        steps.goToHomePage();
        steps.verifyFirstContentContainerName();
    }


    @Test
    public void checkContentContainerByName() {
        steps.goToHomePage();
        steps.verifyContentContainerByName("Бесплатные телеканалы");
    }



}
