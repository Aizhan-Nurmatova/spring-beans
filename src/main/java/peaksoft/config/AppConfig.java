package peaksoft.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.Animal;
import peaksoft.model.AnimalsCage;
import peaksoft.model.Dog;
import peaksoft.model.Timer;

@Configuration
@ComponentScan("peaksoft")
public class AppConfig {

    @Bean
    public Timer getTimer() {
        return new Timer();
    }

}
