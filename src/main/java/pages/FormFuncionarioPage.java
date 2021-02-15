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
        clearAndSetInputValue(driver.findElement(pageLocators.getInputNome()), funcionarioDTO.getNome());
        driver.findElement(pageLocators.getInputCPF()).sendKeys(funcionarioDTO.getCpf());
        selectSexo.selectByVisibleText(funcionarioDTO.getSexo());
        clearAndSetInputValue(driver.findElement(pageLocators.getInputAdmissao()), funcionarioDTO.getAdmissao());
        clearAndSetInputValue(driver.findElement(pageLocators.getInputCargo()), funcionarioDTO.getCargo());
        clearAndSetInputValue(driver.findElement(pageLocators.getInputSalario()), funcionarioDTO.getSalario());
        if (tipoContratacao.equals("clt"))
            driver.findElement(pageLocators.getInputCLT()).click();
        else
            driver.findElement(pageLocators.getInputPJ()).click();
        driver.findElement(pageLocators.getInputCadastrar()).click();
    }
}