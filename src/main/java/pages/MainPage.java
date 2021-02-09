package pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Data
public class MainPage {
    public static WebDriver driver;

    public void openWebsite() {
        driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
    }
}