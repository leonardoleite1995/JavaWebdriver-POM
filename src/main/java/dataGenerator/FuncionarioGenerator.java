package dataGenerator;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import dto.FuncionarioDTO;

public enum FuncionarioGenerator {
    FUNCIONARIO_CLT {
        Name name = new Faker().name();

        @Override
        public FuncionarioDTO pojo() {
            return FuncionarioDTO.builder()
                    .nome(name.fullName())
                    .cpf("166.834.460-24")
                    .sexo("Masculino")
                    .admissao("20/12/2020")
                    .cargo("Analista")
                    .salario("2.500,75")
                    .tipoContratacao("clt")
                    .build();
        }
    },
    FUNCIONARIO_PJ {
        Name name = new Faker().name();

        @Override
        public FuncionarioDTO pojo() {
            return FuncionarioDTO.builder()
                    .nome(name.fullName())
                    .cpf("791.960.280-76")
                    .sexo("Feminino")
                    .admissao("12/02/2021")
                    .cargo("Analista")
                    .salario("2.500,75")
                    .tipoContratacao("pj")
                    .build();
        }
    };

    public abstract FuncionarioDTO pojo();
}