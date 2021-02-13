package br.com.inmetrics.teste.stepDefinitions;

import dataGenerator.MensagemGenerator;
import dto.Mensagem;
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
    public static void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver");
        if (MainPage.driver == null)
            MainPage.driver = (new ChromeDriver());
        MainPage.driver.manage().window().maximize();
    }

    @Dado("que vou para a pagina {string}")
    public void que_vou_para_a_pagina_de_login(String url) {
        page.openWebsite(url);
    }

    @Dado("faco login:")
    public void faco_login(Map<String, String> login) {
        page.preencheFormLogin(login.get("usuario"), login.get("senha"));
    }

    @Entao("o login e realizado com {string}:")
    public void o_login_e_realizado_com_sucesso(String fluxo, Map<String,String> dataTable) {
        if (fluxo.equals("sucesso")) {
            Assert.assertTrue(funcionariosPage.getTableFuncionarios());
            funcionariosPage.sair();
        } else {
            Mensagem mensagem = MensagemGenerator.valueOf(dataTable.get("mensagem")).msg();
            Assert.assertEquals(page.driver.findElement(mensagem.getLocator()).getText(), mensagem.getMsg());
        }
    }
}