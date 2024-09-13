package ar.edu.unahur.obj2.transporte;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutomovilTest {

    Automovil automovil = new Automovil("Rosario");
    String buenosAires = "Buenos Aires";
    String marDelPlata = "Mar del Plata";
    Destino destino = new Destino("Rosario", "Avellaneda 111");
    Paquete paquete = new Paquete(50.0,50.0,20.0,15,destino);
    Destino destino2 = new Destino("Buenos Aires", "Avellaneda 111");
    Paquete paquete2 = new Paquete(70.0,60.0,30.0,30,destino);

    @Test
    public void crearAutomovilCon3Ciudades() {
        automovil.aniadirCiudad(buenosAires); // no me deja ponerlo en la clase AutomovilTest
        automovil.aniadirCiudad(marDelPlata);
        Integer valorObtenido = automovil.getCiudades().size();
        assertEquals(3, valorObtenido.intValue());
    }

    @Test
    public void puedeLlevarPaquete(){
        Boolean valorObtenido = automovil.puedeLlevar(paquete);
        assertTrue(valorObtenido);
    }

    @Test
    public void aniadirPaquete(){
        automovil.aniadirPaquete(paquete);
        Integer valorObtenido = automovil.getPaquetes().size();
        assertEquals(1,valorObtenido.intValue());
    }

    @Test
    public void noPuedeLlevarPaqueteConMismoDestino(){
        automovil.aniadirCiudad(buenosAires);
        automovil.aniadirPaquete(paquete);
        Boolean valorObtenido = automovil.puedeLlevar(paquete2);
        assertFalse(valorObtenido);
    }
}
