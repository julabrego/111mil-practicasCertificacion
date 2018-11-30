/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author PC6
 */
public class CorreoPrivado extends CorreoPublico {
    String usuarioRegistrado = "Juan Carlos";
    
    @Override
    public String leer(String nombreUsuario){
        if (!nombreUsuario.equals(usuarioRegistrado)){
            System.out.println("Error: El nombre de usuario ingresado no coincide con el registrado");
            return null;
        }
        return contenido;
    }
}
