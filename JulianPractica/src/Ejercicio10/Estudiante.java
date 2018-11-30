/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Date;
import java.util.List;

/**
 *
 * @author PC6
 */
public class Estudiante {
   private String nombre;
   private String apellido;
   private Date nacimiento;
   private String direccion;
   private List<Curso> cursadas;
   
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public void setApellido(String apellido){
       this.apellido = apellido;
   }
   
   public String getApellido(){
       return apellido;
   }
   
   public void setNacimiento(Date nacimiento){
       this.nacimiento = nacimiento;
   }
   
   public void setDireccion(String direccion){
       this.direccion = direccion;
   }
   
   public void inscribirCursada(Curso materia){
       this.cursadas.add(materia);
   }
}
