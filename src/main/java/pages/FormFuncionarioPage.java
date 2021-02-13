package pages;

import dto.FuncionarioDTO;
import locators.FormFuncionarioLocators;
import lombok.Data;
import org.openqa.selenium.support.ui.Select;

@Data
public class FormFuncionarioPage extends MainPage {
    private FormFuncionarioLocators pageLocators = new FormFuncionarioLocators();

    public void preencheFormFuncionario(FuncionarioDTO funcionarioDTO) {
        Select selectSexo = new Select(driver.findElement(pageLocators.getSelectSexo()));
        String tipoContratacao = funcionarioDTO.getTipoContratacao();
        driver.findElement(pageLocators.getInputNome()).sendKeys(funcionarioDTO.getNome());
        driver.findElement(pageLocators.getInputCPF()).sendKeys(funcionarioDTO.getCpf());
        selectSexo.selectByVisibleText(funcionarioDTO.getSexo());
        driver.findElement(pageLocators.getInputAdmissao()).sendKeys(funcionarioDTO.getAdmissao());
        driver.findElement(pageLocators.getInputCargo()).sendKeys(funcionarioDTO.getCargo());
        driver.findElement(pageLocators.getInputSalario()).sendKeys(funcionarioDTO.getSalario().toString());
        if (tipoContratacao.equals("clt"))
            driver.findElement(pageLocators.getInputCLT()).click();
        else
            driver.findElement(pageLocators.getInputPJ()).click();
        driver.findElement(pageLocators.getInputCadastrar()).click();
    }
}