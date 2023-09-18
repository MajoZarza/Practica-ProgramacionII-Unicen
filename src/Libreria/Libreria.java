package Libreria;

import java.util.ArrayList;

//Requerimiento:
/*Una libreria requiere un sistema para sus clientes:
La libreria vende libros y revistas. Un libr se comprone de un nombre, autor(solo uno), precio, cantidade d epaginas, un resumen, y el genero literario que abarca(solo uno).
Una revista posee un nombre, un autor, un precio, un numero y un año. Del cliente se guarda su nombre y apellido, dni y direccion, una lista de autores favoritos y de generos favoritos.
Tambien se guarda un listado de sus compras( sean libros o revistas).
La libreria le da descuentos a sus clientes: 10%, 15% o 30%.
Implementar los siguientes servicios:
- conocer el precio de un libro o revista para un cliente determinado(considerando el descuento).
- conocer si un cliente ya compro un libro o una revista determinado.
- conocer si a un cliente le gusta un libro determinado. A algunos clientes les gusta el libro
solo si el autor del mismo esta en su lista de autores favoritos. Pero hay clientes mas exigentes
que piden que el autor este en su lista de favortios y ademas que el genero tambien este en su lista
de generos favoritos.
 */


public class Libreria {

    ArrayList<Producto> productos;
    ArrayList<Cliente> clientes;


    public Libreria(){
        productos = new ArrayList<Producto>();
        clientes = new ArrayList<Cliente>();
    }

    public double getPrecio(Producto p, Cliente c){
        return p.getPrecio(c);
    }

    public boolean comproProducto(Cliente cl, Producto pp){
        return cl.comprasteProducto(pp);
    }

    public boolean leGustaLibro(Cliente cl, Libro l1){
        return cl.leGusta(l1);
    }
}
