package locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class MainPageLocators {
    private By inputUsuario = By.cssSelector("input[name='username']");
    private By inputSenha = By.cssSelector("input[name='pass']");
    private By buttonEntrar = By.className("login100-form-btn");
}
