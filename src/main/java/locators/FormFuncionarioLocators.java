package locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class FormFuncionarioLocators {
    private By inputNome = By.id("inputNome");
    private By inputCPF = By.id("cpf");
    private By selectSexo = By.id("slctSexo");
    private By inputAdmissao = By.id("inputAdmissao");
    private By inputCargo = By.id("inputCargo");
    private By inputSalario =  By.id("dinheiro");
    private By inputCLT = By.id("clt");
    private By inputPJ = By.id("pj");
    private By inputCadastrar = By.className("cadastrar-form-btn");
}