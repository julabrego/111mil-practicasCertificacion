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
public class NoticiaResumida extends Noticia {
    protected String getTituloResumido(){
        return getTituloConFormato().substring(0,20);
    }
    
    protected String getContenidoResumido() {
        return getContenidoConFormato().substring(0,50) + "...";
    }
}
