/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author PC6
 */
public class Noticia {
    private String titulo;
    private String contenido;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    // Retorna el contenido de la primer letra capital.
    protected String getContenidoConFormato() {
        return contenido.substring(0,1).toUpperCase() + contenido.substring(1);
    }
    
    // Retorna el título todo en mayúsculas
    protected String getTituloConFormato() {
        return titulo.toUpperCase();
    }
    
    public String imprimir() {
        return getTituloConFormato() + "\n" + getContenidoConFormato();
    }
}
