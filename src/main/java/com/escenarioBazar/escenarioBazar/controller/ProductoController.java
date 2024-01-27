/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.controller;

import com.escenarioBazar.escenarioBazar.model.Producto;
import com.escenarioBazar.escenarioBazar.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    
     @Autowired
    private IProductoService produServ;
     
      @GetMapping ("/productos")
    public List<Producto> getProductos() {
        
        return produServ.getProductos();
    }
    
    @PostMapping ("/productos/crear")
    public String saveProducto (@RequestBody Producto produ) {
        produServ.saveProducto(produ);
        
        return "El producto fue creado correctamente";
    }
    
     @GetMapping ("/productos/{codigo_producto}")
    public List<Producto> traerProducto(@PathVariable Long codigo_producto) {
        
        return (List<Producto>) produServ.findProducto(Long.MIN_VALUE);
    }
    
    @DeleteMapping ("/productos/eliminar/{codigo_producto}")
    public String deletePersona(@PathVariable Long codigo_producto) {
       produServ.deleteProducto(codigo_producto);
        return "El producto fue eliminado correctamente";
    }
    
    @PutMapping ("/productos/editar/{codigo_producto}")
    public String editProducto(@PathVariable Long codigo_producto,
            @RequestBody Producto produ) {
       produServ.editProducto(produ);
        
        return "El producto fue editado correctamente";
    }
    
     @GetMapping ("/productos/falta_stock")
    public List<Producto> stock() {
        
        return produServ.faltaStock();
    }
    
}
