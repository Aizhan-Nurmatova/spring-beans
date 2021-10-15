package peaksoft.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
@ComponentScan("peaksoft")
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

}
