package ar.edu.unahur.obj2.transporte;

import org.junit.Test;
import static org.junit.Assert.*;

public class DestinoTest {

    @Test
    public void ciudadDeUnDestino() {
        Destino destino = new Destino("Buenos Aires", "Avellaneda 111");
        var valorObtenido = destino.getCiudad();
        assertEquals("Buenos Aires",valorObtenido);
    }
}