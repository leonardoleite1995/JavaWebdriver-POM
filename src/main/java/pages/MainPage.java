package pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Data
public class MainPage {
    public static WebDriver driver;

    public void openWebsite(String url) {
        driver.get(url);
    }
}