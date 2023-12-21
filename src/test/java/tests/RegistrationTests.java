package tests;// ... existing imports ...

import Steps.RegistrationSteps;
import Utils.DatabaseUtil;
import Utils.UserData;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static Steps.RegistrationSteps.generateRandomEmail;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTests {

    @BeforeAll
    static void Setup() {
        Configuration.browser = "chrome";
        open("https://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @Test
    @DisplayName("User Registration Test")
    @Tag("Feature_Registration")
    void testUserRegistration() {
        // Perform registration steps
        RegistrationSteps registrationSteps = new RegistrationSteps();
        registrationSteps.navigateToRegistrationPage()
                .fillRegistrationForm("Giorgi", "Giorgadze", generateRandomEmail(), "1234567890", "zxc-1234", "zxc-1234")
                .clickCheckPolicyBtn()
                .clickContinueBtn();

        // Retrieve registration data after successful registration
        UserData registrationData = registrationSteps.getRegistrationData();

        // Insert registration data into the database
        DatabaseUtil.insertRegistrationData(registrationData);


    }
}
