package ar.edu.unahur.obj2.transporte;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PaqueteTest {

    Double alto = 50.0;
    Double ancho = 50.0;
    Double profundidad = 20.0;
    Integer peso = 8;
    Destino destino = new Destino("Buenos Aires", "Avellaneda 111");
    Paquete paquete = new Paquete(alto,ancho,profundidad,peso,destino);

    @Test
    public void volumenDePaquete() {
        Double valorObtenido = paquete.volumen();
        assertEquals(0.05,valorObtenido.doubleValue(),0.001);
    }
    @Test
    public void pesoDePaquete() {
        Integer valorObtenido = paquete.getPeso();
        assertEquals(8,valorObtenido.intValue());
    }
    @Test
    public void pesoDePdaquete() {
        Integer valorObtenido = paquete.getPeso();
        assertEquals(8,valorObtenido.intValue());
    }
}
