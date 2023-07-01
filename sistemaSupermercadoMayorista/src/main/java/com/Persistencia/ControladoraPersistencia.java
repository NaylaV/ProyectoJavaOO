
package com.Persistencia;

import com.Logica.Producto;
import com.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    ProductoJpaController productoJpa = new ProductoJpaController();

    public void agregarProducto(Producto producto) {
        productoJpa.create(producto);
    }

    public List<Producto> traerProductos() {
       return productoJpa.findProductoEntities();
    }

    public void borrarProducto(int idProd) {
        try {
            productoJpa.destroy(idProd);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Producto traerProductos(int idProd) {
    return productoJpa.findProducto(idProd);
    }
    
    public void modificarProducto(Producto producto) {
        try {
            productoJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
