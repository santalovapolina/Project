package tests.web;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class HomeTests extends TestBase {

    private WebSteps steps = new WebSteps(new WebDriverRunner());

    @Test
    public void test1() {
        steps.goToHomePage();
        steps.verifyHeaderMenuTabs();
    }

    @Test
    public void test2() {
        steps.goToHomePage();
        steps.verifyFirstContentContainerName();
    }


    @Test
    public void test3() {
        steps.goToHomePage();
        steps.checkContainerByName("Бесплатные телеканалы");
    }



}
