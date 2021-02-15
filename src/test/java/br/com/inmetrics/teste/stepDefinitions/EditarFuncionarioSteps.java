package br.com.inmetrics.teste.stepDefinitions;

import dataGenerator.MensagemGenerator;
import dto.Mensagem;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.FuncionariosPage;

import java.util.Map;

public class EditarFuncionarioSteps {
    FuncionariosPage funcionariosPage = new FuncionariosPage();

    @Quando("acesso a pagina de edicao de dados de funcionarios")
    public void acesso_a_pagina_de_edicao_de_dados_de_funcionarios() {
        funcionariosPage.editarFuncionario();
    }

    @Entao("o funcionario e editado com {string}:")
    public void o_funcionario_e_editado_com(String fluxo, Map<String, String> dataTable) {
        Mensagem mensagem = MensagemGenerator.valueOf(dataTable.get("mensagem")).msg();
        Assert.assertEquals(funcionariosPage.driver.findElement(mensagem.getLocator()).getText(), mensagem.getMsg());
    }
}