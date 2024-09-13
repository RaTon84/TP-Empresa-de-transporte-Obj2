package ar.edu.unahur.obj2.transporte;

import static org.junit.Assert.*;
import org.junit.Test;

public class BicicletaTest {

    Bicicleta bici = new Bicicleta("Buenos Aires");
    Destino destino = new Destino("Buenos Aires", "Avellaneda 111");
    Paquete paquete = new Paquete(50.0,50.0,20.0,15,destino);

    @Test
    public void crearBicicleta(){
        String ciudadDeLaBici = bici.getCiudad();
        assertEquals("Buenos Aires", ciudadDeLaBici);
    }

    @Test
    public void puedeLlevarPaquete(){
        Boolean valorObtenido = bici.puedeLlevar(paquete);
        assertTrue(valorObtenido);
    }

    @Test
    public void aniadirPaquete(){
        bici.aniadirPaquete(paquete);
        String valorObtenido = bici.getDestino().getCiudad();
        assertEquals("Buenos Aires",valorObtenido);
    }
}
