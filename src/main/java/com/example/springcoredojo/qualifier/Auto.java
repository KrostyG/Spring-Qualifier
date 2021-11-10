package com.example.springcoredojo.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Auto implements Vehiculo{

    @Override
    public int cantidadRuedas() {
        return 4 ;
    }
}
