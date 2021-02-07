package br.com.inmetrics.teste.stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.LoginPage;

import java.util.Map;

public class LoginSteps {

    LoginPage page = new LoginPage();

    @Dado("que vou para a pagina de login")
    public void que_vou_para_a_pagina_de_login() {
        page.openWebsite();
    }

    @Dado("faco login:")
    public void faco_login(Map<String, String> login) {
       page.preencheFormLogin(login.get("usuario"), login.get("senha"));
    }

    @Entao("o login e realizado com sucesso")
    public void o_login_e_realizado_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
