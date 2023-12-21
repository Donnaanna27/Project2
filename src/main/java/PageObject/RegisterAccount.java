package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegisterAccount {
   public SelenideElement

           myAccountbtn = $(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")),
           registerbtn = $(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")),
           firstNameInput = $(By.xpath("//input[@id=\"input-firstname\"]")),
           lastNameInput = $(byXpath("//input[@id=\"input-lastname\"]")),
           emailInput = $(By.xpath("//input[@id=\"input-email\"]")),
           telephoneInput = $(By.xpath("//input[@id=\"input-telephone\"]")),
           passwordInput = $(By.xpath("//input[@id=\"input-password\"]")),
           checkpolisybtn = $("#content > form > div > div > input[type=checkbox]:nth-child(2)"),
           confirmpasswordInput = $(By.xpath("//input[@id='input-confirm']")),
           continuebtn = $(byXpath("//input[@type='submit' and @value='Continue' and contains(@class, 'btn-primary')]"));
}
