
package Animal;

public class Caballo extends Animales {

    public Caballo(String nombre, int edad, String tipo_Alimentacion) {
        super(nombre, edad, tipo_Alimentacion);
    }
    @Override
    public String toString() {
       return "Nombre: "+nombre+"\n"+
               "Edad: "+edad+"\n"+
               "Tipo de alimentacion: "+tipo_Alimentacion;
    }
    @Override
    public void sonidoAnimal() {
        System.out.println("Onomatopeya: ¡Hii, Hii!");
    }
     
}
