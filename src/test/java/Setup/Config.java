package Setup;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class Config {
    public Config() {
        browserSize = "1024x768";
        screenshots = false;
        savePageSource = false;
        open("https://tutorialsninja.com/demo/index.php?route=common/home");
    }
}
