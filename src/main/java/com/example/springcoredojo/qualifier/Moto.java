package com.example.springcoredojo.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Vehiculo{

    @Override
    public int cantidadRuedas() {
        return 2;
    }
}
