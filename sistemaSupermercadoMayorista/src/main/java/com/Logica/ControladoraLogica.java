
package com.Logica;

import com.Persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlP = new ControladoraPersistencia();

    public void agregarProducto(String nombre, float precio, int cantidad) {
         
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);

        controlP.agregarProducto(producto);
    }

    public List<Producto> traerProductos() {
        return controlP.traerProductos();
    }

    public void borrarProducto(int idProd) {
        controlP.borrarProducto(idProd);
    }
    
    public Producto traerProductos(int idProd) {
        return controlP.traerProductos(idProd);
    }
    
    public void modificarProducto(Producto producto, String nombre, float precio, int cantidad) {
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        controlP.modificarProducto(producto);
    }
    
}
