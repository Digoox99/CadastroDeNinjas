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

    @PostMapping("/criar")
    public String criarNinja(){
            return "Ninja criado";
    }


    @GetMapping("/todosID")
    public String todosID(){
        return "Mostra ninja por id";
    }

    //altera
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar ninja por id";
    }

    @DeleteMapping("/deleteID")
    public String deletarPorID(){
            return "Ninja deletado por ID";
    }


}
