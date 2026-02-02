package dev.rodrigo.CadastroDeNinjas.Missoes;

import dev.rodrigo.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name="tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDaMissao;
    private String dificuldadeDaMissao;
    private NinjaModel ninja;

}
