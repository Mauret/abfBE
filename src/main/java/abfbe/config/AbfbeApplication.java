package abfbe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "abfbe")
public class AbfbeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbfbeApplication.class, args);
    }
}
