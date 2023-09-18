package Libreria;

public class ClienteLeVieneBien extends Cliente{

    public ClienteLeVieneBien(String nombre, String apellido, String direccion, long dni) {
        super(nombre, apellido, direccion, dni);
    }

    @Override
    public boolean leGusta(Libro l1) {
        return true;
    }
}
