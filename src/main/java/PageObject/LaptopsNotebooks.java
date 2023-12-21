package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class LaptopsNotebooks {
    public SelenideElement

            LaptopsNotebooks = $(By.xpath("//a[text()='Laptops & Notebooks']\n")),
            LaptopsNotebooksbtn = $(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/div/a")),
            sortby=$(By.xpath("//*[@id=\"input-sort\"]")),
            sortbyPrice=$("#input-sort > option:nth-child(5)"),
            leptopprice=$(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/p[2]"));



}