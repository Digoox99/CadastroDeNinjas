package dev.rodrigo.CadastroDeNinjas.Ninjas;
import dev.rodrigo.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import java.util.List;

//transformando classe em Entidade
@Entity
@Table(name="tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name= "missoes_id")
    private MissoesModel missoes;


    public NinjaModel(){

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
