package Steps;

import PageObject.LoginPage;

public class LoginSteps extends LoginPage {

    public LoginSteps login() {
        myAccountbtn.click();
        Loginbotton.click();
        emailInput.setValue("example@examle.com");
        passwordInput.setValue("zxc-1234");
        LoginButton2.click();
        return this;
    }

}
