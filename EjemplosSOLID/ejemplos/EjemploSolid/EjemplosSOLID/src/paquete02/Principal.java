
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Zamora");
        Ciudad c2 = new Ciudad("Malacatos");
        Persona per1 = new Persona("Luis Leon ", 20, c1);
        Persona per2 = new Persona("Luis Sarango", 24, c2);
        
        System.out.printf("%s\n", per1.obtenerEdad());
        System.out.printf("%s\n", per2.obtenerEdad());
        OperacionesEstudiantes op1= new OperacionesEstudiantes();       
        ArrayList<Persona> list = new ArrayList<>();
        list.add(per1);
        list.add(per2);
        op1.establecerEstudiante(list);
        op1.establecerPromedioEdades();
        op1.estbalcerEdadMinima();
        op1.establecerCiudaes();
        System.out.printf("El promedio de edades es: %.2f\n", op1.obtenerPromedioEdades());
        System.out.printf("%d\n",op1.obtenerEdadMinima());
        System.out.printf("%s\n",op1.obtenerCiuadades());
    }
}
