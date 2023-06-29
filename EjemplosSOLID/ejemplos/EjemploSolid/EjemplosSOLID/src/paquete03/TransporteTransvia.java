/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author luisa
 */
class TransporteTransvia {
    private String cooperativatransvia;
    private double tarifa;
     public void establecerCooperativaTransvia(String n){
        cooperativatransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 20.00+ 0.10;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativatransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
}
