package pages;

import locators.CadastroUsuarioLocators;

public class CadastroUsuarioPage extends MainPage {
    private CadastroUsuarioLocators pageLocators = new CadastroUsuarioLocators();

    public void preencheFormCadastroUsuario(String usuario, String senha, String confirmaSenha) {
        driver.findElement(pageLocators.getInputUsuario()).sendKeys(usuario);
        driver.findElement(pageLocators.getInputSenha()).sendKeys(senha);
        driver.findElement(pageLocators.getInputConfirmaSenha()).sendKeys(confirmaSenha);
        driver.findElement(pageLocators.getButtonCadastrar()).click();
    }

    public String getDivErroUsuarioText() {
        return driver.findElement(pageLocators.getDivErroUsuario()).getText();
    }

    public String getDivErroSenhaText() {
        return driver.findElement(pageLocators.getDivErroSenha()).getText();
    }
}