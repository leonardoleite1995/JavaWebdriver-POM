package br.com.inmetrics.teste.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FuncionariosPage;
import pages.LoginPage;
import pages.MainPage;

import java.util.Map;

public class LoginSteps {

    LoginPage page = new LoginPage();
    FuncionariosPage funcionariosPage = new FuncionariosPage();

    @Before
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver");
        if (MainPage.driver == null)
            MainPage.driver = (new ChromeDriver());
    }

    @Dado("que vou para a pagina de login")
    public void que_vou_para_a_pagina_de_login() {
        page.openWebsite();
    }

    @Dado("faco login:")
    public void faco_login(Map<String, String> login) {
        page.preencheFormLogin(login.get("usuario"), login.get("senha"));
    }

    @Entao("o login e realizado com {string}")
    public void o_login_e_realizado_com_sucesso(String cenario) {
        if (cenario.equals("sucesso")) {
            Assert.assertTrue(funcionariosPage.getTableFuncionarios());
            funcionariosPage.sair();
        } else {
            Assert.assertEquals(page.getDivAlertText(), "ERRO! Usuário ou Senha inválidos\n" + "×");
        }
    }
}