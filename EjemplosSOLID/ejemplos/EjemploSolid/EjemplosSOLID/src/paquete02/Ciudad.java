/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author luisa
 */
class Ciudad {
    private String nombreCiudad;
    public Ciudad(String n){
            nombreCiudad=n;
            }
    public void establecerCiudad(String c){
        nombreCiudad=c;
    }
    public String obtenerCiudad(){
        return nombreCiudad;
    }

    @Override
    public String toString() {
        String Cadena = String.format("Ciudad %s\n",obtenerCiudad());
        return Cadena;
    }
    
}
