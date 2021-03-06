package idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import idat.config.FileStorageProperties;


@EnableConfigurationProperties({FileStorageProperties.class})
@SpringBootApplication
public class App {
    public static void main (String[] args){
        SpringApplication.run(App.class, args);
    }
}
