/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.service;

import com.escenarioBazar.escenarioBazar.model.Cliente;
import com.escenarioBazar.escenarioBazar.model.Producto;
import com.escenarioBazar.escenarioBazar.repository.IClienteRepository;
import com.escenarioBazar.escenarioBazar.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    
     @Autowired
    private IClienteRepository repoCli;

    @Override
    public List<Cliente> getClientes() {
        List<Cliente> listaClientes = repoCli.findAll();
        return listaClientes;
    }

    @Override
    public void saveCliente(Cliente cli) {
        repoCli.save(cli);
    }
       

    @Override
    public void deleteCliente(Long id_cliente) {
       repoCli.deleteById(id_cliente);
    }

    @Override
    public Cliente findCliente(Long id_cliente) {
        return repoCli.findById (id_cliente).orElse(null);
    }

    
    @Override
    public void editCliente(Cliente cli) {
      this.saveCliente(cli);
    }
    
}
