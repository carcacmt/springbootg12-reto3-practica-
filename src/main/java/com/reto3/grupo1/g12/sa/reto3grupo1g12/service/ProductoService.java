/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.grupo1.g12.sa.reto3grupo1g12.service;

import com.reto3.grupo1.g12.sa.reto3grupo1g12.entity.Producto;
import com.reto3.grupo1.g12.sa.reto3grupo1g12.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos Caceres Ochoa
 */
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    /**
     * C
     * Nuevo registro de Producto
     */
    public Producto saveProducto(Producto producto) {
        return repository.save(producto);
    }

    /**
     * R
     * Mostrar Todos los Productos
     */
    public List<Producto> getProductos() {
        return repository.findAll();
    }

    /**
     * U
     * Actualizar Registro de la tabla producto
     */
    public Producto updateProducto(Producto producto) {
        Producto existeProducto = repository.findById(producto.getId())
                                            .orElse(null);
        existeProducto.setNombre(producto.getNombre());
        existeProducto.setInventario(producto.getInventario());
        existeProducto.setPrecio(producto.getPrecio());
        repository.save(existeProducto);
        return existeProducto;
    }
    
    /**
     * D
     * Eliminar Registro de la tabla producto
     * 
     */
    
    public String deleteProducto(int id){
        
        repository.deleteById(id);
        return "Producto Removido "+id;        
    }

}
