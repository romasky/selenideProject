import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


abstract public class baseTest {

    //Метод отвечающий за настройки и инициализацию браузера, а также за его установку
    public void setUp() {
        Configuration.browser = "chrome";           //  Эта строка устанавливает браузер, который будет использоваться для автоматизации тестирования. В данном случае, выбран браузер Chrome.
        Configuration.browserSize = "1920x1080";     //Эта строка устанавливает размер окна браузера в пикселях. В данном случае, установлен размер 1920x1080, что соответствует стандартному разрешению Full HD.
        Configuration.headless = false;             // Эта строка устанавливает режим браузера. Если значение headless установлено в true, то браузер будет работать в "безголовом" режиме, что означает, что он не будет отображать графический интерфейс. В данном случае, установлено false, что означает, что браузер будет видимым при выполнении тестов.
        Configuration.holdBrowserOpen = true;
    }


    @BeforeEach
    public void init() {
        setUp();            // Т.е. перед каждым запуском тестов, у нас будет происходить инициализация вебдрайвера
    }


    /*@AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }*/

}
