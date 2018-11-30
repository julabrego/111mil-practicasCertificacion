/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.List;

/**
 *
 * @author PC6
 */
public class Carrera {
    private String nombre;
    private List<Curso> materias;
    private List<Estudiante> estudiantesInscriptos;
    
    public String Carrera(String nombreCarrera){
        return nombreCarrera;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public List<Curso> getMaterias(){
        return materias;
    }
    
    public void inscribir(Estudiante){
        this.estudiantesInscriptos.add(Estudiante);
    }
    
    public boolean agregarCurso(Curso){
    }
    
    
    
}
