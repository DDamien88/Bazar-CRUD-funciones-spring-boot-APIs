/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.controller;

import com.escenarioBazar.escenarioBazar.model.Cliente;
import com.escenarioBazar.escenarioBazar.model.Producto;
import com.escenarioBazar.escenarioBazar.service.IClienteService;
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
public class ClienteController {
    
    @Autowired
    private IClienteService servCli;
     
      @GetMapping ("/clientes")
    public List<Cliente> getClientes() {
        
        return servCli.getClientes();
    }
    
    @PostMapping ("/clientes/crear")
    public String saveCliente (@RequestBody Cliente cli) {
       servCli.saveCliente(cli);
        
        return "El cliente fue creado correctamente";
    }
    
     @GetMapping ("/clientes/{id_cliente}")
    public List<Cliente> traerCliente(@PathVariable Long id_cliente) {
        
        return (List<Cliente>) servCli.findCliente(Long.MIN_VALUE);
    }
    
    @DeleteMapping ("/clientes/eliminar/{id_cliente}")
    public String deleteCliente(@PathVariable Long id_cliente) {
       servCli.deleteCliente(id_cliente);
        return "El cliente fue eliminado correctamente";
    }
    
    @PutMapping ("/clientes/editar/{id_cliente}")
    public String editCliente(@PathVariable Long id_cliente,
            @RequestBody Cliente cli) {
       servCli.editCliente(cli);
        
        return "El cliente fue editado correctamente";
    }
    
}
