package locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class CadastroUsuarioLocators {
    private By inputUsuario = By.cssSelector("input[name='username']");
    private By inputSenha = By.cssSelector("input[name='pass']");
    private By inputConfirmaSenha = By.cssSelector("input[name='confirmpass']");
    private By buttonCadastrar = By.className("login100-form-btn");
    private By divErroUsuario = By.xpath("(//span[@class='txt1']/div)[1]");
    private By divErroSenha = By.xpath("(//span[@class='txt1']/div)[2]");
    private By linkCadastreSe = By.cssSelector("a[href='/accounts/login/']");
}