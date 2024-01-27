
package com.escenarioBazar.escenarioBazar.service;

import com.escenarioBazar.escenarioBazar.dto.ProductoVentaDTO;
import com.escenarioBazar.escenarioBazar.model.Venta;
import com.escenarioBazar.escenarioBazar.repository.IVentaRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{

      @Autowired
    private IVentaRepository repoVen;    
    
    @Override
    public List<Venta> getVentas() {
        List<Venta> listaVentas = repoVen.findAll();
        return listaVentas;
    }

    @Override
    public void saveVenta(Venta ven) {
        repoVen.save(ven);
    }

    @Override
    public void deleteVenta(Long codigo_venta) {
       repoVen.deleteById(codigo_venta);
    }

    @Override
    public Venta findVenta(Long codigo_venta) {
        
       return repoVen.findById (codigo_venta).orElse(null);
    }

    @Override
    public void editVenta(Venta ven) {
       this.saveVenta(ven);
    }
    
    @Override
    public ProductoVentaDTO productosPorVenta(Long codigo_venta) {
        
        ProductoVentaDTO proVenDTO = new ProductoVentaDTO();
        Venta venta = this.findVenta(codigo_venta);
        proVenDTO.setListaProd(venta.getListaProductos());
        return proVenDTO;
        
    }
 
    
}
