package dataGenerator;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import dto.Usuario;

import java.util.Locale;

public class UsuarioGenerator {
    public static Usuario genarateUsuario() {
        Faker faker = new Faker(new Locale("en"));
        String username = faker.name().username();
        return Usuario.builder()
                .username(username)
                .password(username.concat("123"))
                .build();
    }

    public static void main(String[] args) {
        Usuario user = genarateUsuario();
        System.out.println(user);
    }
}
