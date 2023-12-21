package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Desktops {
    public SelenideElement

            Decktop = $(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")),
            AllDesktop = $("#menu>div.collapse.navbar-collapse.navbar-ex1-collapse>ul>li:nth-child(1)>div>a"),
            Mp3player = $(By.xpath("//*[@id=\"column-left\"]/div[1]/a[10]")),
            IpodShuffle = $(By.xpath("//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[1]/h4/a")),
            iPodShufflelink=$("#content > div:nth-child(8) > div:nth-child(3) > div > div:nth-child(2) > div.caption > h4 > a"),
            addToCard=$(By.xpath("//button[@id=\"button-cart\"]")),
            items=$(By.xpath("//*[@id=\"cart-total\"]")),
            itemCount=$(By.xpath("//table[@class='your-table-class']//tbody/tr/td[3]")),
            itemPrice=$(By.xpath("//table[@class='your-table-class']//tbody/tr/td[4]")),
            CheckOut1=$(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")),
            firstName=$(By.xpath("//input[@id=\"input-payment-firstname\"]")),
            lastName=$(By.xpath("//input[@id=\"input-payment-lastname\"]")),
            company=$(By.xpath("//input[@id=\"input-payment-company\"]")),
            Address1=$(By.xpath("//input[@id=\"input-payment-address-1\"]")),
            City=$(By.xpath("//input[@id=\"input-payment-city\"]")),
            postcode=$(By.xpath("//input[@id=\"input-payment-postcode\"]")),
            country=$(By.xpath("//select[@id=\"input-payment-country\"]")),
            region=$(By.xpath("//select[@id=\"input-payment-zone\"]")),
            continuebtn1=$(By.xpath("//input[@id=\"button-payment-address\"]")),
            continuebtn2=$(By.xpath("//input[@id=\"button-shipping-address\"]")),
            continuebtn3=$(By.xpath("//input[@id=\"button-shipping-method\"]")),
            checkOut2=$(By.xpath("//input[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")),
            continuebtn4=$(By.xpath("//input[@id=\"button-payment-method\"]")),
            subTotal=$(By.xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[1]/td[2]")),
            flatShippingRate=$(By.xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[1]/td[2]")),
            TotalPrice=$(By.xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[3]/td[2]")),
            confirmOrderbtn=$(By.xpath("//input[@id=\"button-confirm\"]")),
            succsefulorder=$(By.xpath("//*[@id=\"content\"]/h1"));




           
}