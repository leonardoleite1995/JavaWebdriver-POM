package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {
    private String nome;
    private String cpf;
    private String sexo;
    private String admissao;
    private String cargo;
    private String salario;
    private String tipoContratacao;
}