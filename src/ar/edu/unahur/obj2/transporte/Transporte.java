package ar.edu.unahur.obj2.transporte;

import java.util.ArrayList;

public abstract class Transporte {

    protected ArrayList<Paquete> paquetes = new ArrayList<Paquete>();

    public abstract Boolean puedeLlevar(Paquete paquete);

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

    public void aniadirPaquete(Paquete paquete) {
        if (puedeLlevar(paquete)) {
            paquetes.add(paquete);
        }
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }
}
