package dev.rodrigo.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes") //faz com que a rota comece de missoes e vá para missoes/...
public class MissoesController {

    @PostMapping("/criar") // não dá erro devido o "missoes" do RequestMapping. Post cria algo.
    public String criarMissao(){
        return "Missão criada!";
    }

    @PutMapping("/alterar")  //Altera algo
    public String alterarMissao(){
        return "Missão alterada!";
    }

    @DeleteMapping("/deletar")  //Deleta algo
    public String deletarMissao(){
        return "Missão deletada!";
    }

    @GetMapping("/listar")   //Dá algo ao usuário
    public String listarMissoes(){
        return "Missões listadas!";
    }


}
