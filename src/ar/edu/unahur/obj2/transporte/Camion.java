package ar.edu.unahur.obj2.transporte;

import java.util.ArrayList;

public class Camion extends Transporte {

    private ArrayList<String> ciudades = new ArrayList<String>();

    @Override
    public Boolean puedeLlevar(Paquete paquete) {
        return (getVolumenPaquetes() + paquete.volumen() <= 20.0
                && getPesoPaquetes() + paquete.getPeso() <= 16_000);
    }

}
