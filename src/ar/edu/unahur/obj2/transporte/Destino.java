package ar.edu.unahur.obj2.transporte;

public class Destino {

    private String ciudad;
    private String direccion;

    public Destino(String ciudad, String direccion) {
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
}
