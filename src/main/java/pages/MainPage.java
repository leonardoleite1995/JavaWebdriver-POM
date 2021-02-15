package pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Data
public class MainPage {
    public static WebDriver driver;

    public void openWebsite(String url) {
        driver.get(url);
    }

    public void clearAndSetInputValue(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}