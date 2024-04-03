import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig{

    @Bean
    public WebConfigurar corsConfigurar(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry){
                registry.addMapping("/api/**").allowedOrigins("http://localhost:4200/cadastro/criar-cadastro").allowedMethods("GET","POST").allowedHeaders("*").allowCredentials(true);
            }
        };
    }
}