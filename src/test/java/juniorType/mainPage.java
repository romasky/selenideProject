import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class mainPage {
    private final Logger logger = LogManager.getLogger(mainPage.class);
    private final SelenideElement searchButton = $x("//form");
    private final SelenideElement textInput = $x("//input[@type='text']");

    public mainPage(String url) {
        Selenide.open(url);
        logger.info("url is open");
    }

    public void clickOnSearch() {
        searchButton.click();
    }

    /**
     * Выполняется поиск среди статей
     * @param text поисковая строка
     */
    public void setInputValue(String text) {
        textInput.setValue(text);
        textInput.sendKeys(Keys.ENTER);
    }

   /* //обычный способ для новичков
    public void openWebsite(String url) {
        Selenide.open(url);
    }*/


}
