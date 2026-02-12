package dev.rodrigo.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id){
        return ninjaService.listarNinjasporID(id);
    }
    //Lista todos os Ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
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
