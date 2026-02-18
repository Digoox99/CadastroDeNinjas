package dev.rodrigo.CadastroDeNinjas.Ninjas;

import dev.rodrigo.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private Long id;

    private String nome;

    private String email;

    private String img_url;
    private String rank;

    private int idade;

    private MissoesModel missoes;
}
