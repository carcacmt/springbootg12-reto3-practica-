/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.grupo1.g12.sa.reto3grupo1g12.repository;

import com.reto3.grupo1.g12.sa.reto3grupo1g12.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    
}
