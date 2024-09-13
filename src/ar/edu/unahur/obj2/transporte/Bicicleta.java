package ar.edu.unahur.obj2.transporte;

import java.util.ArrayList;

public class Bicicleta extends Transporte{

    private String ciudad;
    private Destino destino = null;

    public Bicicleta(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public Boolean puedeLlevar(Paquete paquete) {
        //this.paquetes.add(paquete);
        return this.ciudad.equals(paquete.getCiudad())
                && this.paquetes.size() < 2
                && getVolumenPaquetes() + paquete.volumen() <= 0.125
                && getPesoPaquetes() + paquete.getPeso() <= 15;
    }

    @Override
    public void aniadirPaquete(Paquete paquete) {
        if (puedeLlevar(paquete)) {
            this.paquetes.add(paquete);
            this.destino = paquete.getDestino();
        }else {
            throw new RuntimeException("No se pudo agregar el paquete");
        }
    }

    public Destino getDestino() {
        return destino;
    }
}
