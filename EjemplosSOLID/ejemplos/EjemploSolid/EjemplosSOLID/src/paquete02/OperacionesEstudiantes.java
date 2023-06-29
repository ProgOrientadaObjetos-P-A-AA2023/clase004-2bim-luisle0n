/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private String ciudades="";
  
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerCiudaes(){
        for(Persona e: obtenerEstudiante()){
            ciudades=String.format("%sCiudades: %s\n",
                    ciudades,e.obtenerCiudad().obtenerCiudad());
           }
        
    }
  
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma+e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public void estbalcerEdadMinima(){ 
        edadminima = obtenerEstudiante().get(0).obtenerEdad();
       for(Persona e: obtenerEstudiante()){
            if (e.obtenerEdad()< edadminima) {
                edadminima = e.obtenerEdad();
               
           }
        }             
    }
    public int obtenerEdadMinima(){
        return edadminima;
    }
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    public String obtenerCiuadades(){
        return ciudades;
    }
    
    
}
