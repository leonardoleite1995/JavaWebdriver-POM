package dataGenerator;

import com.github.javafaker.Faker;
import dto.Usuario;

import java.util.Locale;

public enum UsuarioGenerator {
    USUARIO_SIMPLES {
        @Override
        public Usuario pojo() {
            Faker faker = new Faker(new Locale("en"));
            String username = faker.name().username();
            return Usuario.builder()
                    .username(username)
                    .password(username.concat("123"))
                    .confirmPassword(username.concat("123"))
                    .build();
        }
    },
    SENHA_DIFERENTE_CONFIRMACAO {
        @Override
        public Usuario pojo() {
            Faker faker = new Faker(new Locale("en"));
            String username = faker.name().username();
            return Usuario.builder()
                    .username(username)
                    .password(username.concat("123"))
                    .confirmPassword("teste1234")
                    .build();
        }
    },
    USERNAME_JA_CADASTRADO {
        @Override
        public Usuario pojo() {
            return Usuario.builder()
                    .username("testeteste")
                    .password("testeteste")
                    .confirmPassword("testeteste")
                    .build();
        }
    };

    public abstract Usuario pojo();
}