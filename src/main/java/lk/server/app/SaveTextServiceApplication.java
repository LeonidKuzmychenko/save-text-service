package lk.server.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SaveTextServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaveTextServiceApplication.class, args);
    }

}
