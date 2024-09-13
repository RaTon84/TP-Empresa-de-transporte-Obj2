package ar.edu.unahur.obj2.transporte;

import java.util.ArrayList;

public class Automovil extends Transporte {

    private ArrayList<String> ciudades = new ArrayList<String>();

    public Automovil(String ciudad) {
        this.ciudades.add(ciudad);
    }

    public void aniadirCiudad(String ciudad) {
        if (ciudades.size()<=2) {
            this.ciudades.add(ciudad);
        }else {
            throw new RuntimeException("Solo puede tener 3 ciudades");
        }
    }

    @Override
    public Boolean puedeLlevar(Paquete paquete) {
        return this.ciudades.contains((paquete.getCiudad()))
                && !paquetes.stream()
                    .anyMatch(p -> p.getDestino().equals(paquete.getDestino()))
//                && !paquetes.stream()
//                    .map(Paquete::getDestino).toList().contains(paquete.getDestino())
                && getVolumenPaquetes() + paquete.volumen() <= 2.0
                && getPesoPaquetes() + paquete.getPeso() <= 500;
    }

    public ArrayList<String> getCiudades() {
        return ciudades;
    }

}
