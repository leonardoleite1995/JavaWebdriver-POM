package locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class FuncionariosLocators {
    private By tableFuncionarios = By.id("tabela");
    private By linkSair = By.xpath("(//a[@class='nav-link text-uppercase font-weight-bold'])[3]");
}