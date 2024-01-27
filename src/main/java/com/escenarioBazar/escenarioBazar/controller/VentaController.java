/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.controller;

import com.escenarioBazar.escenarioBazar.dto.ProductoVentaDTO;
import com.escenarioBazar.escenarioBazar.model.Venta;
import com.escenarioBazar.escenarioBazar.service.IVentaService;
import java.time.LocalDate;
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
public class VentaController {
    
    @Autowired
    private IVentaService servVenta;
     
      @GetMapping ("/ventas")
    public List<Venta> getVentas() {
        
        return servVenta.getVentas();
    }
    
    @PostMapping ("/ventas/crear")
    public String saveVenta (@RequestBody Venta ven) {
       servVenta.saveVenta(ven);
        
        return "La venta fue creada correctamente";
    }
    
     @GetMapping ("/ventas/{codigo_venta}")
    public List<Venta> traerVenta(@PathVariable Long codigo_venta) {
        
        return (List<Venta>) servVenta.findVenta(Long.MIN_VALUE);
    }
    
    @DeleteMapping ("/ventas/eliminar/{codigo_venta}")
    public String deleteVenta(@PathVariable Long codigo_venta) {
       servVenta.deleteVenta(codigo_venta);
        return "La venta fue eliminada correctamente";
    }
    
    @PutMapping ("/ventas/editar/{codigo_venta}")
    public String editVenta(@PathVariable Long codigo_venta,
            @RequestBody Venta ven) {
       servVenta.editVenta(ven);
        
        return "La venta fue editada correctamente";
    }
    
      @GetMapping ("/ventas/productos/{codigo_venta}")
     public ProductoVentaDTO productosPorVenta (@PathVariable Long codigo_venta) {
        return servVenta.productosPorVenta(codigo_venta);
    
    }
     
     /*@GetMapping("/ventas/{fecha_venta}")
     public List<Venta> sumatoriaYTotalPorDia (@PathVariable LocalDate fecha_venta) {
        return servVenta.ventasSumatoriaPorDia(fecha_venta);
    
    }*/
    
    
    
}
