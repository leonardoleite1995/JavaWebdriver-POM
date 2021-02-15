package br.com.inmetrics.teste.stepDefinitions;

import dataGenerator.MensagemGenerator;
import dto.Mensagem;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.FuncionariosPage;

import java.util.Map;

public class ExcluirFuncionarioSteps {
    FuncionariosPage funcionariosPage = new FuncionariosPage();

    @Quando("excluo um funcionario")
    public void excluo_um_funcionario() {
        funcionariosPage.excluiFuncionario();
    }

    @Entao("o funcionario e excluido com {string}:")
    public void o_funcionario_e_excluido_com(String fluxo, Map<String, String> dataTable) {
        Mensagem mensagem = MensagemGenerator.valueOf(dataTable.get("mensagem")).msg();
        Assert.assertEquals(funcionariosPage.driver.findElement(mensagem.getLocator()).getText(), mensagem.getMsg());
    }
}