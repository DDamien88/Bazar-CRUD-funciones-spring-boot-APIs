/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.service;

import com.escenarioBazar.escenarioBazar.model.Producto;
import java.util.List;


public interface IProductoService {
    
     //método para traer a todas las personas
    //lectura
    public List<Producto> getProductos();

    //alta
    public void saveProducto(Producto produ);

    //baja
    public void deleteProducto(Long codigo_producto);

    //lectura de un solo objeto
    public Producto findProducto(Long codigo_producto);

    //edición/modificación
    public void editProducto (Producto produ);
    
     public List<Producto> faltaStock();
}
