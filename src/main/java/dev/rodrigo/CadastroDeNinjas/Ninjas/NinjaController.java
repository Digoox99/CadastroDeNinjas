package dev.rodrigo.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Seja bem vindo!";
    }

    //fazer CRUD

    //Rota para criar um Ninja
    @PostMapping("/criar")
    public String criarNinja(){
            return "Ninja criado";
    }

    //Mostra os Ninjas por ID
    @GetMapping("/todosID")
    public String todosID(){
        return "Mostra ninja por id";
    }

    //Altera o ID do ninja
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar ninja por id";
    }

    //Deletar Ninja
    @DeleteMapping("/deleteID")
    public String deletarPorID(){
            return "Ninja deletado por ID";
    }


}
