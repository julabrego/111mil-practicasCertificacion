/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC6
 */
public class ListaDeProductosFiltrada extends ListaDeProductos {
    public List<Producto> filtrarPorLetra(char letra){
        List<Producto> listaFiltrada = new ArrayList<Producto>();
        
        for (Producto productoAnalizado : this.getProductos()){
            char inicial = productoAnalizado.getNombre().charAt(0);
            
            if (inicial == letra){
                 listaFiltrada.add(productoAnalizado);
            }
        }
        
        return listaFiltrada;
    }
}
