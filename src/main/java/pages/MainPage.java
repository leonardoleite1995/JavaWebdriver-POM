package pages;

import locators.MainPageLocators;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Data
public class MainPage {

    private WebDriver driver;

    public void openWebsite(){
        System.setProperty("webdriver.chrome.driver","src/main/java/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
    }

}
