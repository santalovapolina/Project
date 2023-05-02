package tests.web;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class Tests extends TestBase {

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

    @Test // todo не совпадает размер по ассерту(без любы аксеновой сорри)
    public void test3() {
        steps.goToHomePage();
        steps.verifyAllContentContainersHasOptionToExpand();
    }

    @Test
    public void test4() {
        steps.goToHomePage();
        steps.checkContainerByName("Бесплатные телеканалы");
    }




}
