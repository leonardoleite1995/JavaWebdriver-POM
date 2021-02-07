package pages;

import locators.MainPageLocators;
import lombok.Data;

@Data
public class LoginPage extends MainPage {

    private MainPageLocators pageLocators = new MainPageLocators();

    public void preencheFormLogin(String usuario, String senha) {
        getDriver().findElement(pageLocators.getInputUsuario()).sendKeys(usuario.toString());
        getDriver().findElement(pageLocators.getInputSenha()).sendKeys(senha.toString());
        //getDriver().close();
    }

}
