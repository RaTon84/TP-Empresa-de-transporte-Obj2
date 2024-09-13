package ar.edu.unahur.obj2.transporte;

import static org.junit.Assert.*;
import org.junit.Test;

public class CamionTest {

    private Camion camion = new Camion();
    private String ciudad1 = "Buenos Aires";
    private String ciudad2 = "Mar del Plata";
    private Destino destino = new Destino("Rosario", "Avellaneda 111");
    private Paquete paquete = new Paquete(50.0,50.0,20.0,15_000,destino);

    @Test
    public void crearCamion() {
        Camion camion = new Camion(); // como comprobar el camion??? le paso una ciudad como constructor?
        assertTrue(true);
    }

    @Test
    public void puedeLlevarPaquete(){
        Boolean valorObtenido = camion.puedeLlevar(paquete);
        assertTrue(valorObtenido);
    }

    @Test
    public void aniadirPaquete(){
        camion.aniadirPaquete(paquete);
        Integer valorObtenido = camion.getPaquetes().size();
        assertEquals(1,valorObtenido.intValue());
    }
}
