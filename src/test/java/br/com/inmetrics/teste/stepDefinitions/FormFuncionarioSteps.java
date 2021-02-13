package br.com.inmetrics.teste.stepDefinitions;

import dataGenerator.FuncionarioGenerator;
import dataGenerator.MensagemGenerator;
import dto.FuncionarioDTO;
import dto.Mensagem;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.FormFuncionarioPage;
import pages.FuncionariosPage;

import java.util.Map;

public class FormFuncionarioSteps {
    FormFuncionarioPage formFuncionarioPage = new FormFuncionarioPage();
    FuncionariosPage funcionariosPage = new FuncionariosPage();

    @Quando("acesso a pagina de cadastro de funcionarios")
    public void acesso_a_pagina_de_cadastro_de_funcionarios() {
       funcionariosPage.novoFuncionario();
    }

    @Quando("preencho os dados do funcionario: {string}")
    public void preencho_os_dados_do_funcionario_teste(String funcionario) {
        FuncionarioDTO funcionarioDTO = FuncionarioGenerator.valueOf(funcionario).pojo();
        formFuncionarioPage.preencheFormFuncionario(funcionarioDTO);
    }

    @Entao("o funcionario e cadastrado com {string}:")
    public void o_funcionario_e_cadastrado_com(String fluxo, Map<String,String> dataTable) {
//        if (fluxo.equals("sucesso")) {
//            Assert.assertEquals(loginPage.getSpanFormTitletext(), "Login");
//        } else {
//            Mensagem mensagem = MensagemGenerator.valueOf(dataTable.get("mensagem")).msg();
//            Assert.assertEquals(page.driver.findElement(mensagem.getLocator()).getText(), mensagem.getMsg());
//        }
    }
}
