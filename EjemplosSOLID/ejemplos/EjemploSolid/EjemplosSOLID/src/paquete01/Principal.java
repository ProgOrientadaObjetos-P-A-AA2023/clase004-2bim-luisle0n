package paquete01;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Persona per1 = new Persona("Luis Leon", 20);
        Persona per2 = new Persona("Luis Sarango", 20);
        System.out.printf("%s\n", per1.obtenerEdad());
        System.out.printf("%s\n", per2.obtenerEdad());
        ArrayList<Persona> list = new ArrayList<>();
        list.add(per1);
        list.add(per2);
        double promedio = per1.promedioEdades(list);
        System.out.printf("%.2f\n", promedio);

    }
}
