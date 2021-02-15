package dataGenerator;

import dto.Mensagem;
import locators.CadastroUsuarioLocators;
import locators.FuncionariosLocators;
import locators.LoginLocators;

public enum MensagemGenerator {
    LOGIN_USUARIO_OU_SENHA_INVALIDOS {
        @Override
        public Mensagem msg() {
            return Mensagem.builder()
                    .msg("ERRO! Usuário ou Senha inválidos\n" + "×")
                    .locator(new LoginLocators().getDivAlert())
                    .build();
        }
    },
    USUARIO_SENHAS_NAO_CONFEREM {
        @Override
        public Mensagem msg() {
            return Mensagem.builder()
                    .msg("Senhas não combinam")
                    .locator(new CadastroUsuarioLocators().getDivErroSenha())
                    .build();
        }
    },
    USUARIO_JA_CADASTRADO {
        @Override
        public Mensagem msg() {
            return Mensagem.builder()
                    .msg("Usuário já cadastrado")
                    .locator(new CadastroUsuarioLocators().getDivErroUsuario())
                    .build();
        }
    },
    FUNCIONARIO_CADASTRADO_COM_SUCESSO {
        @Override
        public Mensagem msg() {
            return Mensagem.builder()
                    .msg("SUCESSO! Usuário cadastrado com sucesso\n" + "×")
                    .locator(new FuncionariosLocators().getDivMsgSucesso())
                    .build();
        }
    },
    FUNCIONARIO_EXCLUIDO_COM_SUCESSO {
        @Override
        public Mensagem msg() {
            return Mensagem.builder()
                    .msg("SUCESSO! Funcionário removido com sucesso\n" + "×")
                    .locator(new FuncionariosLocators().getDivMsgSucesso())
                    .build();
        }
    },
    FUNCIONARIO_EDITADO_COM_SUCESSO {
        @Override
        public Mensagem msg() {
            return Mensagem.builder()
                    .msg("SUCESSO! Informações atualizadas com sucesso\n" + "×")
                    .locator(new FuncionariosLocators().getDivMsgSucesso())
                    .build();
        }
    };

    public abstract Mensagem msg();
}