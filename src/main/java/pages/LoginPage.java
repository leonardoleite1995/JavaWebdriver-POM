package pages;

import dto.UsuarioDTO;
import locators.LoginLocators;
import lombok.Data;

@Data
public class LoginPage extends MainPage {

    private LoginLocators pageLocators = new LoginLocators();

    public void preencheFormLogin(UsuarioDTO usuario) {
        driver.findElement(pageLocators.getInputUsuario()).sendKeys(usuario.getUsername());
        driver.findElement(pageLocators.getInputSenha()).sendKeys(usuario.getPassword());
        driver.findElement(pageLocators.getButtonEntrar()).click();
    }

    public String getDivAlertText() {
        return driver.findElement(pageLocators.getDivAlert()).getText();
    }

    public String getSpanFormTitletext() {
        return driver.findElement(pageLocators.getSpanFormTitle()).getText();
    }
}