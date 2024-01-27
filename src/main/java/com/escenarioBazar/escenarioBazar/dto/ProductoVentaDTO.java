package com.escenarioBazar.escenarioBazar.dto;

import com.escenarioBazar.escenarioBazar.model.Producto;
import com.escenarioBazar.escenarioBazar.model.Venta;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoVentaDTO {
    
    private Venta venta;
    private List<Producto> listaProd;

    public ProductoVentaDTO() {
    }

    public ProductoVentaDTO(Venta venta, List<Producto> listaProd) {
        this.venta = venta;
        this.listaProd = listaProd;
    }

   
    
    
}
