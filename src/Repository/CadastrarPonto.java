import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadastroponto.RegistroPonto;

public interface CadastrarPonto extends JpaRepository<RegistroPonto, Long> {

    List<registro> findBy(String nome);
    List<registro> findAll(String matricula);
    
    
} 

