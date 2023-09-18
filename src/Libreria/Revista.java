package Libreria;

public class Revista extends Producto{
    protected int numero;
    protected int anio;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Revista(String nombre, String autor, double precio, int numero, int anio) {
        super(nombre, autor, precio);
        this.numero = numero;
        this.anio = anio;
    }
}
