package ru.alexander.springaop.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

@Component
public class SomeService {

    public int getIntValue() {
        return 5;
    }

    public double getDoubleValue() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SomeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 5.7;
    }

}
