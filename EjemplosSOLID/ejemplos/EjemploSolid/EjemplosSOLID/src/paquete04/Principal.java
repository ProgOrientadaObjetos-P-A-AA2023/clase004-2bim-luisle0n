/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerCooperativaTransvia("Loja");
        transvia.establecerTarifa();
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> list = new ArrayList<>();
        list.add(bus);
        list.add(taxi);
        list.add(transvia);
        tipos.establecerTransportes(list);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f\n",
                tipos.obtenerPromedioTarifas());

    }
}
