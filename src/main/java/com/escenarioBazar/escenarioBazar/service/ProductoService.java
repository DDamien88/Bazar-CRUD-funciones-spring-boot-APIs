/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.service;

import com.escenarioBazar.escenarioBazar.model.Producto;
import com.escenarioBazar.escenarioBazar.repository.IProductoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository repoProdu;
    
    @Override
    public List<Producto> getProductos() {
        List<Producto> listaDuenios = repoProdu.findAll();
        return listaDuenios;
    }

    @Override
    public void saveProducto(Producto produ) {
        repoProdu.save(produ);
    }

    @Override
    public void deleteProducto(Long codigo_producto) {
         repoProdu.deleteById(codigo_producto);
    }

    @Override
    public Producto findProducto(Long codigo_producto) {
             return repoProdu.findById (codigo_producto).orElse(null);
    }

    @Override
    public void editProducto(Producto produ) {
             this.saveProducto(produ);
    }
    
    
    @Override
    public List<Producto> faltaStock() {
        List<Producto> listaProductos = repoProdu.findAll();
        List<Producto> produStock = new ArrayList<>();
        
        for (Producto pro: listaProductos) {
            if (pro.getCantidad_disponible()<5) {
                produStock.add(pro);
            }
        }
        return produStock;
    }
    
}
