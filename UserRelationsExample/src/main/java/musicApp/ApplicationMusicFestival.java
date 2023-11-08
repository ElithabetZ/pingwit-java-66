package musicApp;

import UserApp.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ApplicationMusicFestival {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMusicFestival.class, args);
    }
}
