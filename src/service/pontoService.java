import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import net.bytebuddy.asm.Advice.Return;



public interface  FuncionarioService {
    Funcionario cadastrarFuncionario(Funcionario funcionario);
    
}

@Service
public class PontoService implements FuncionarioService {
    
    @Autowired
    private FuncionaioRepository funcionaioRepository;
    
    private final String TEMPLATE_PATH = "template/template.html";


    @Override
    public Funcionario cadastrarFuncionario(Funcionario entity){
        try{
            Funcionario novoFuncionario = new Funcionario();
            BeanUtils.copyProperties(funcionario, novoFuncionario,"id","matriculaFuncionario","nome_funcionario","Horario_Registro");
            repository.save(funcionario);
            return  funcionario;
        }catch(Exception e){
            throw new cinbesaException("Erro ao cadastrar Funcionario", e);
        }
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests() 
            .antMatchers("/cadastro").hasRole("ADMIN")
            .antMatchers(HttpMethod.POST, "/cadastro").hasRole("USUARIO")
            .antMatchers("/cadastro/**").permitAll()
            .antMatchers("/").permitAll()
            .anyRequest().authenticated()
            .and().formLogin();

    }
}

    