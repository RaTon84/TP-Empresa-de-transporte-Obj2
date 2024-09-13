package ar.edu.unahur.obj2.transporte;

public class Paquete {

    private Double alto;
    private Double ancho;
    private Double profundidad;
    private Integer peso;
    private Destino destino;

    public Paquete(Double alto, Double ancho, Double profundidad,Integer peso,Destino destino) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.peso = peso;
        this.destino = destino;
    }

    public Double volumen() {
        return ((this.alto/100) * (this.ancho/100) * (this.profundidad/100));
    }

    public Integer getPeso() {
        return this.peso;
    }
    public String getCiudad() {
        return this.destino.getCiudad();
    }

    public Destino getDestino() {
        return destino;
    }
}
