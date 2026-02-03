package dev.rodrigo.CadastroDeNinjas.Missoes;

import dev.rodrigo.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDaMissao;
    private String dificuldadeDaMissao;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
