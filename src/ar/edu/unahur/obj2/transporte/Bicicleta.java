package ar.edu.unahur.obj2.transporte;

import java.util.ArrayList;

public class Bicicleta {

    private String ciudad;
    private ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
    private String destino = null;

    public Bicicleta(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Boolean puedeLlevar(Paquete paquete) {
        //this.paquetes.add(paquete);
        return this.paquetes.size() < 2 && getVolumenPaquetes() + paquete.volumen() < 0.125 && getPesoPaquetes() + paquete.getPeso() <= 15;
    }

    public Integer getPesoPaquetes() {
        Integer total = 0;
        for (Paquete paquete : this.paquetes) {
            total += paquete.getPeso();
        }
        return total;
    }

    public Double getVolumenPaquetes() {
        Double total = 0.0;
        for (Paquete paquete : paquetes) {
            total += paquete.volumen();
        }
        return total;
    }


    public void añadirPaquete(Paquete paquete) {
        if (puedeLlevar(paquete)) {
            paquetes.add(paquete);
            this.destino = paquete.getDestino();
        }
    }

    public String getDestino() {
        return destino;
    }
}
