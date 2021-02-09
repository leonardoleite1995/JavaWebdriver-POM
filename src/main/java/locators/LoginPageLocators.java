package locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {
    private By inputUsuario = By.cssSelector("input[name='username']");
    private By inputSenha = By.cssSelector("input[name='pass']");
    private By inputConfirmaSenha = By.cssSelector("input[name='confirmpass']");
    private By buttonEntrar = By.className("login100-form-btn");
    private By divAlert = By.cssSelector("div.alert");
    private By linkCadastreSe = By.cssSelector("/accounts/signup/");
}
