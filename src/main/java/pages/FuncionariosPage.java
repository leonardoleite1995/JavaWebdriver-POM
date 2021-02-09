package pages;

import locators.FuncionariosPageLocators;
import lombok.Data;

@Data
public class FuncionariosPage extends MainPage {

    private FuncionariosPageLocators pageLocators = new FuncionariosPageLocators();

    public Boolean getTableFuncionarios() {
        return driver.findElement(pageLocators.getTableFuncionarios()).isDisplayed();
    }

    public void sair() {
        driver.findElement(pageLocators.getLinkSair()).click();
    }
}
