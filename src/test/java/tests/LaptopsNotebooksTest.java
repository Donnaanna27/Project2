package tests;

import Setup.Config;
import Steps.LaptopsNotebooksSteps;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

@Tag("Epic_Laptops_Notebooks")
public class LaptopsNotebooksTest extends Config {

    @BeforeAll
    static void Setup() {
        Configuration.browser = "chrome";
        open("https://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @Test
    @DisplayName("Navigate to Laptops and Notebooks Page Test")
    @Tag("Feature_Laptops_Notebooks")
    void testNotebooksPage() {
        LaptopsNotebooksSteps laptopsSteps = new LaptopsNotebooksSteps();

        laptopsSteps
                .LaptopsNotebooksPage()
                .sortByPriceHighToLow()
                .checkItemPriceVisibility();

    }


}
