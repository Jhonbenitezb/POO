
package composicion;

import modelos.Coche;
import modelos.Motor;
public class Composicion {

    public static void main(String[] args) {
       // Crear un coche
        Coche miCoche = new Coche();

        // Arrancar y apagar el coche
        miCoche.arrancar();
        miCoche.apagar();
    }
    
}
