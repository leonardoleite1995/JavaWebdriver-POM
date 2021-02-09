package pages;

import locators.LoginPageLocators;
import lombok.Data;

@Data
public class LoginPage extends MainPage {

    private LoginPageLocators pageLocators = new LoginPageLocators();

    public void preencheFormLogin(String usuario, String senha) {
        driver.findElement(pageLocators.getInputUsuario()).sendKeys(usuario);
        driver.findElement(pageLocators.getInputSenha()).sendKeys(senha);
        driver.findElement(pageLocators.getButtonEntrar()).click();
    }

    public String getDivAlertText(){
        return driver.findElement(pageLocators.getDivAlert()).getText();
    }
}
