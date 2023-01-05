package ASI.esprit.examenspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication

public class ExamenSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenSpringApplication.class, args);
    }

}
