package pages;

import locators.FuncionariosLocators;
import lombok.Data;

@Data
public class FuncionariosPage extends MainPage {

    private FuncionariosLocators pageLocators = new FuncionariosLocators();

    public Boolean getTableFuncionarios() {
        return driver.findElement(pageLocators.getTableFuncionarios()).isDisplayed();
    }

    public void sair() {
        driver.findElement(pageLocators.getLinkSair()).click();
    }
}