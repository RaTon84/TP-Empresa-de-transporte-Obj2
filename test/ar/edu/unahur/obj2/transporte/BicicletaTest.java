package ar.edu.unahur.obj2.transporte;

import static org.junit.Assert.*;
import org.junit.Test;

public class BicicletaTest {

    Bicicleta bici = new Bicicleta("Buenos Aires");
    Double alto = 50.0;
    Double ancho = 50.0;
    Double profundidad = 20.0;
    Integer peso = 15;
    String destino = "Buenos Aires";
    Paquete paquete = new Paquete(alto,ancho,profundidad,peso,destino);

    @Test
    public void crearBicicleta(){
        String ciudadDeLaBici = bici.getCiudad();
        assertEquals("Buenos Aires", ciudadDeLaBici);
    }

    @Test
    public void puedeLlevarPaquete(){
        Boolean valorObtenido = bici.puedeLlevar(paquete);
        System.out.printf(paquete.volumen().toString());
        assertEquals(true,valorObtenido);
    }

    @Test
    public void añadirPaquete(){
        bici.añadirPaquete(paquete);
        String valorObtenido = bici.getDestino();
        System.out.printf(paquete.volumen().toString());
        assertEquals("Buenos Aires",valorObtenido);
    }
}
