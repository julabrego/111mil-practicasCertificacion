/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cientooncemil.hibernate.model.muchosamuchos;

import com.cientooncemil.hibernate.model.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mmino
 */


 public class Rol {
     
     private int id;
     private String nombre;
     private Set<Cliente> clientes=new HashSet();

     public Rol() {

     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
     
     
 }
