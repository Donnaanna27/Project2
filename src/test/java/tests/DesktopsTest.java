package tests;

import Steps.DesktopsSteps;
import Steps.LoginSteps;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DesktopsTest {

    public DesktopsSteps desktopsSteps;

    @BeforeClass
    public void setUp() {
        // Open the browser and navigate to the tutorialsninja demo site
        Selenide.open("http://tutorialsninja.com/demo/");

        // Instantiate the DesktopsSteps class
        desktopsSteps = new DesktopsSteps();
    }

    @BeforeClass(dependsOnMethods = "setUp")
    public void loginSteps() {
        // Instantiate the LoginSteps class and perform login
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login();
    }

    @Test(groups = "Regression2")
    public void completeOrderProcess() {
        desktopsSteps
                .hoverOverIpodShuffleAndGetText()
                .checkProductInCart()
                .fillForm()
                .continueBtns()
                .confirmOrder();
    }
}
