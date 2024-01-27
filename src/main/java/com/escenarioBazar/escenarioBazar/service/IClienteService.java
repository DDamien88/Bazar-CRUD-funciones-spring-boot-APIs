/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.escenarioBazar.escenarioBazar.service;

import com.escenarioBazar.escenarioBazar.model.Cliente;
import java.util.List;


public interface IClienteService {
    
    //método para traer a todas las personas
    //lectura
    public List<Cliente> getClientes();

    //alta
    public void saveCliente(Cliente cli);

    //baja
    public void deleteCliente(Long id_cliente);

    //lectura de un solo objeto
    public Cliente findCliente(Long id_cliente);

    //edición/modificación
    public void editCliente(Cliente cli);
}
