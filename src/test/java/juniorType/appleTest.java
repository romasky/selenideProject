import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class appleTest extends baseTest {

    private static String BASE_URL = "https://appleinsider.ru/";
    private static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";

    /* Вся логика должна выполняться только в тестовых классах, указание переменных,
    * сравнение что-то с чем-то, а логика взаимодействия с элементами
    * должна происходить в Page-классах */

    @Test
    public void checkHref() {
        mainPage mainPage = new mainPage(BASE_URL);
        //mainPage.clickOnSearch();
        mainPage.setInputValue(SEARCH_STRING);
        searchPage searchPage = new searchPage();
        String href = searchPage.getHrefFromFirstArticle();
        Assertions.assertTrue(href.contains("iphone-13"));
    }
}
