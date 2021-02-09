package br.com.inmetrics.teste.stepDefinitions;

import dataGenerator.UsuarioGenerator;
import dto.Usuario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pages.CadastroUsuarioPage;
import pages.LoginPage;

public class CadastroUsuarioSteps {

    CadastroUsuarioPage page = new CadastroUsuarioPage();
    LoginPage loginPage = new LoginPage();

    @Dado("preencho os dados do usuario: {string}")
    public void preencho_os_dados_do_usuario(String string) {
        Usuario usuario = UsuarioGenerator.valueOf(string).pojo();
        page.preencheFormCadastroUsuario(usuario.getUsername(), usuario.getPassword(), usuario.getConfirmPassword());
    }

    @Entao("o usuario e cadastrado com {string}")
    public void o_usuario_e_cadastrado_com(String string) {
        if (string.equals("sucesso")) {
            Assert.assertEquals(loginPage.getSpanFormTitletext(), "Login");
        }
    }
}
