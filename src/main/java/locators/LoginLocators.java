package locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginLocators {
    private By inputUsuario = By.cssSelector("input[name='username']");
    private By inputSenha = By.cssSelector("input[name='pass']");
    private By buttonEntrar = By.className("login100-form-btn");
    private By divAlert = By.cssSelector("div.alert");
    private By linkCadastreSe = By.cssSelector("a[href='/accounts/signup/']");
    private By spanFormTitle = By.cssSelector("span.login100-form-title");
}