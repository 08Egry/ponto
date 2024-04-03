
import org.springframework.beans.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
@RestController
@RequestMapping(value = "/ponto")
public class RegistroService {
    
    @Autowired
    private PontoRepository pontoRepository;

    @GetMapping(value = "/registro")
    public ResponseEntity<ponto> ReceberRegistro(){
        List<ponto> registro = pontoRepository.findAll();
        return ResponseEntity.ok().build();

    }

    @PostMapping( value = "/cadastro")
    public String SalvarPonto(@RequestBody Ponto ponto){
        pontoRepository.POST(ponto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Registro Salvo com sucesso");
    }

}
