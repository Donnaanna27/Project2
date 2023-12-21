package Steps;

import PageObject.RegisterAccount;
import Utils.UserData;
import com.codeborne.selenide.Condition;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationSteps extends RegisterAccount {

    public RegistrationSteps navigateToRegistrationPage() {
        myAccountbtn.click();
        registerbtn.click();
        return this;
    }

    public RegistrationSteps fillRegistrationForm(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        emailInput.setValue(email);
        telephoneInput.setValue(telephone);
        passwordInput.setValue(password);
        confirmpasswordInput.setValue(confirmPassword);
        return this;
    }

    public static String generateRandomEmail() {
        return "testuser" + new Random().nextInt(10000) + "@example.com";
    }

    public RegistrationSteps clickCheckPolicyBtn() {
        checkpolisybtn.click();
        checkpolisybtn.shouldBe(Condition.checked);
        return this;
    }

    public RegistrationSteps clickContinueBtn() {
        continuebtn.click();
        return this;
    }

    public UserData getRegistrationData() {
        String firstName = firstNameInput.getValue();
        String lastName = lastNameInput.getValue();
        String email = emailInput.getValue();
        String  telephone = telephoneInput.getValue();
        String  password=passwordInput.getValue();
        String  confirmpassword=confirmpasswordInput.getValue();

        return new UserData(firstName, lastName, email,telephone, password,confirmpassword);
    }

    public boolean isRegistrationSuccessful() {
        return $(".alert-success").exists();
    }
}
