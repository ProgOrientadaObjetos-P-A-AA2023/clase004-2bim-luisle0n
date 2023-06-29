/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author luisa
 */
public class TransporteTransvia extends Transporte{

    private String cooperativatransvia;

     public void establecerCooperativaTransvia(String n){
        cooperativatransvia = n;
    }
     @Override
    public void establecerTarifa(){
        tarifa = 20.00+ 0.10;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativatransvia;
    }
    

    
}
