/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.service;

import com.escenarioBazar.escenarioBazar.dto.ProductoVentaDTO;
import com.escenarioBazar.escenarioBazar.model.Producto;
import com.escenarioBazar.escenarioBazar.model.Venta;
import java.time.LocalDate;
import java.util.List;

 public interface IVentaService {
     
     //método para traer a todas las personas
    //lectura
    public List<Venta> getVentas();

    //alta
    public void saveVenta(Venta ven);

    //baja
    public void deleteVenta(Long codigo_venta);

    //lectura de un solo objeto
    public Venta findVenta(Long codigo_venta);

    //edición/modificación
    public void editVenta(Venta ven);
    
    public ProductoVentaDTO productosPorVenta(Long codigo_venta);
    
    
}
