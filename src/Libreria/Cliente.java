package Libreria;


import java.util.ArrayList;

public class Cliente {
    protected String nombre;

    protected String apellido;

    protected String direccion;

    protected long dni;
    protected double descuento;

    protected ArrayList<String> autoresFavoritos;
    protected ArrayList<String> generosFavoritos;

    protected ArrayList<Producto> compras;

    private Comportamiento comport;


    public Cliente(String nombre, String apellido, String direccion, long dni) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        autoresFavoritos = new ArrayList<String>();
        generosFavoritos = new ArrayList<String>();

        compras = new ArrayList<Producto>();
        ArrayList<Producto> compras = new ArrayList<Producto>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void addAutoresFavoritos(String nombre){
        if(!autoresFavoritos.contains(nombre)){
            autoresFavoritos.add(nombre);
        }

    }
    public void addGenerosFavoritos(String genero){
        if(!generosFavoritos.contains(genero)){
            generosFavoritos.add(genero);
        }

    }
    public void addProductoComprado(Producto prod){
        if(!compras.contains(prod)){
            compras.add(prod);
        }
    }
    public boolean comprasteProducto(Producto pp){
    /*
        for(int i=0; i<compras.size(); i++){
            Producto p1 = compras.get(i);
            if(p1.equals(pp)){
                return true;
            }
        }
        return false;
*/
        return compras.contains(pp);
    }

    public boolean leGustaGenero(String genero){
        return generosFavoritos.contains(genero);
    }

    public boolean leGustaAutor(String autor){
        return autoresFavoritos.contains(autor);
    }

    public boolean leGusta(Libro l1){
        return comport.leGusta(l1, this);

    }

    public void setComportamiento(Comportamiento cc){
        comport = cc;
    }


}


