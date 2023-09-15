package herenciaclases;

import Animal.Animales;
import Animal.Caballo;
import Animal.Gato;
import Animal.Perro;

public class HerenciaClases {

    public static void main(String[] args) {
        
        Animales perro1 = new Perro("Pitbull", "Juan", 8, "Omnivoro");
        Animales gato1 = new Gato("Persa", "Ramon", 8, "Omnivoro");
        Animales caballo1 = new Caballo("Jacinto", 10, "Omnivoro");

        System.out.println("Perro \n"+perro1.toString());
        perro1.sonidoAnimal();
        System.out.println("Gato \n"+gato1.toString());
        gato1.sonidoAnimal();
        System.out.println("Caballo \n"+caballo1.toString());  
        caballo1.sonidoAnimal();
    }

}
