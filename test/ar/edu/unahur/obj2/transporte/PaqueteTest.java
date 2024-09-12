package ar.edu.unahur.obj2.transporte;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PaqueteTest {

    Double alto = 2.0;
    Double ancho = 2.0;
    Double profundidad = 2.0;
    Integer peso = 8;
    String destino = "Buneos Aires";
    Paquete paquete = new Paquete(alto,ancho,profundidad,peso,destino);

    @Test
    public void volumenDePaquete() {
        Double valorObtenido = paquete.volumen();
        Integer valorEsperado = 8;
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void pesoDePaquete() {
        Integer valorObtenido = paquete.getPeso();
        Integer valorEsperado = 8;
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void pesoDePdaquete() {
        Integer valorObtenido = paquete.getPeso();
        Integer valorEsperado = 8;
        assertEquals(valorEsperado,valorObtenido);
    }
}
