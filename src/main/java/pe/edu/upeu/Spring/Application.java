package pe.edu.upeu.Spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
    public class Application implements CommandLineRunner {

    @Autowired
        private BCryptPasswordEncoder passwordEncoder;

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }

        @Bean
        public Docket productApi() {
            return new Docket(DocumentationType.SWAGGER_2).select()
                    .apis(RequestHandlerSelectors.basePackage("upeu.edu.pe")).build();
        }
    @Override
        public void run(String... args) throws Exception {
            String password = "admin";
            for (int i = 0; i < 4; i++) {
                String passwordBcrypt = passwordEncoder.encode(password);
                System.out.println(passwordBcrypt);
                }
            } 
        }
