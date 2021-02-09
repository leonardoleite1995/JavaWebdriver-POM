package pages;

import locators.LoginLocators;
import lombok.Data;

@Data
public class LoginPage extends MainPage {

    private LoginLocators pageLocators = new LoginLocators();

    public void preencheFormLogin(String usuario, String senha) {
        driver.findElement(pageLocators.getInputUsuario()).sendKeys(usuario);
        driver.findElement(pageLocators.getInputSenha()).sendKeys(senha);
        driver.findElement(pageLocators.getButtonEntrar()).click();
    }

    public String getDivAlertText() {
        return driver.findElement(pageLocators.getDivAlert()).getText();
    }

    public String getSpanFormTitletext() {
        return driver.findElement(pageLocators.getSpanFormTitle()).getText();
    }
}