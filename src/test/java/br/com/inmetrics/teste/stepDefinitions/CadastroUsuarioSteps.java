package br.com.inmetrics.teste.stepDefinitions;

import dataGenerator.MensagemGenerator;
import dataGenerator.UsuarioGenerator;
import dto.Mensagem;
import dto.UsuarioDTO;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pages.CadastroUsuarioPage;
import pages.LoginPage;

import java.util.Map;

public class CadastroUsuarioSteps {
    CadastroUsuarioPage page = new CadastroUsuarioPage();
    LoginPage loginPage = new LoginPage();

    @Dado("preencho os dados do usuario: {string}")
    public void preencho_os_dados_do_usuario(String string) {
        UsuarioDTO usuario = UsuarioGenerator.valueOf(string).pojo();
        page.preencheFormCadastroUsuario(usuario.getUsername(), usuario.getPassword(), usuario.getConfirmPassword());
    }

    @Entao("o usuario e cadastrado com {string}:")
    public void o_usuario_e_cadastrado_com(String fluxo, Map<String, String> dataTable) {
        if (fluxo.equals("sucesso")) {
            Assert.assertEquals(loginPage.getSpanFormTitletext(), "Login");
        } else {
            Mensagem mensagem = MensagemGenerator.valueOf(dataTable.get("mensagem")).msg();
            Assert.assertEquals(page.driver.findElement(mensagem.getLocator()).getText(), mensagem.getMsg());
        }
    }
}