package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
        public SelenideElement

                myAccountbtn = $(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")),
                Loginbotton = $(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")),
                emailInput = $(By.xpath(" //*[@id=\"input-email\"]")),
                passwordInput = $(By.xpath("//input[@id=\"input-password\"]")),
                LoginButton2=$(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

}
